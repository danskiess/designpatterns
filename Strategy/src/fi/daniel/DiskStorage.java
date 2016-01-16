package fi.daniel;

public class DiskStorage implements Storage {
    @Override
    public void save(String content) {
        System.out.println("Saving " + content + " to disk");
    }
}
