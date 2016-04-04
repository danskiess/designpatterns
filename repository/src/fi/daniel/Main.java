package fi.daniel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DogMemoryDatabase dogMemoryDatabase = new DogMemoryDatabase(new HashMap<>());
        DogRepository dogRepository = new DogRepository(dogMemoryDatabase);

        SqlSpecification chSpecification = new SqlSpecification() {
            @Override
            public String toSqlQuery() {
                return "ch";
            }
        };

        SqlSpecification allSpecification = new SqlSpecification() {
            @Override
            public String toSqlQuery() {
                return "";
            }
        };

        List<Dog> dogs = dogRepository.query(chSpecification);
        printList(dogs);

        dogMemoryDatabase.add(new Dog("Chili"));
        dogs = dogRepository.query(chSpecification);
        printList(dogs);

        dogMemoryDatabase.add(new Dog("Chi"));
        dogMemoryDatabase.add(new Dog("Bella"));
        dogs = dogRepository.query(chSpecification);
        printList(dogs);

        List<Dog> dogsToAdd = Arrays.asList(new Dog("Nacho"), new Dog("Brutus"), new Dog("Gator"));
        dogMemoryDatabase.add(dogsToAdd);
        dogs = dogRepository.query(allSpecification);
        printList(dogs);

        Dog dogToRemove = dogs.get(1);
        System.out.println("Dog to remove: " + dogToRemove.getName());
        dogMemoryDatabase.remove(dogToRemove);
        dogs = dogRepository.query(allSpecification);
        printList(dogs);

    }

    public static void printList(List<Dog> dogList){
        System.out.println("---Printing dogs---");
        if (dogList.isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        for (Dog dog : dogList){
            System.out.println(dog.getName());
        }
    }
}
