package fi.daniel;

public class Trooper implements Soldier {

    @Override
    public void add(Soldier soldier) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void get(Soldier soldier) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void remove(Soldier soldier) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void attack() {
        System.out.println("Trooper attacks with full strength!");
    }
}
