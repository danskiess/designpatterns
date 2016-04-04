package fi.daniel;

import java.util.HashMap;
import java.util.List;

public class DogRepository implements Repository<Dog>{


    private final DogMemoryDatabase dogMemoryDatabase;

    public DogRepository(DogMemoryDatabase dogMemoryDatabase) {
        this.dogMemoryDatabase = dogMemoryDatabase;
    }

    @Override
    public void add(Dog item) {
        dogMemoryDatabase.add(item);
    }

    @Override
    public void add(Iterable<Dog> iterable) {
        dogMemoryDatabase.add(iterable);
    }

    @Override
    public void update(Dog item) {
        dogMemoryDatabase.add(item);
    }

    @Override
    public void remove(Dog item) {
        dogMemoryDatabase.remove(item);
    }

    @Override
    public void remove(Specification specification) {

    }

    @Override
    public List<Dog> query(Specification specification) {
        SqlSpecification sqlSpecification = (SqlSpecification) specification;
        return dogMemoryDatabase.query(sqlSpecification.toSqlQuery());
    }
}
