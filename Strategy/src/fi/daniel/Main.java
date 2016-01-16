package fi.daniel;

public class Main {

    public static void main(String[] args) {
        Storage storage = new DiskStorage();
        Xbox xbox = new Xbox(storage);
        xbox.saveData();

        storage = new CloudStorage();
        xbox = new Xbox(storage);
        xbox.saveData();
    }
}
