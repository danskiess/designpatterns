package fi.daniel;

public class DogNameSpecification implements SqlSpecification{

    private final String dogName;

    public DogNameSpecification(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String toSqlQuery() {
        return dogName;
    }
}
