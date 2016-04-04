package fi.daniel;

import java.util.*;
import java.util.stream.Collectors;

public class DogMemoryDatabase {

    private final Map<String, Dog> dogHashMap;

    public DogMemoryDatabase(HashMap<String, Dog> dogHashMap) {
        this.dogHashMap = dogHashMap;
    }

    public void add(Dog dog){
        if (!dogHashMap.containsKey(dog.getName())){
            dogHashMap.put(dog.getName(), dog);
        }
    }

    public void add(Iterable<Dog> iterable){
        for(Dog dog : iterable){
            add(dog);
        }
    }

    public void update(Dog dog){
    }

    public void remove(Dog dog){
        if (dogHashMap.containsKey(dog.getName())){
            dogHashMap.remove(dog.getName());
        }
    }

    public List<Dog> query(String queryName){
        if (!dogHashMap.isEmpty()){
            return dogHashMap.entrySet()
                    .stream()
                    .filter(dogEntry -> dogEntry.getKey().toLowerCase().contains(queryName.toLowerCase()))
                    .map(Map.Entry::getValue)
                    .collect(Collectors.toCollection(LinkedList::new));
        }
        return Collections.emptyList();
    }
}
