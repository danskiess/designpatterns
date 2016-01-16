package fi.daniel;

public class CloudStorage implements Storage {
    @Override
    public void save(String content) {
        System.out.println("Saving " + content + " to cloud");
    }
}
