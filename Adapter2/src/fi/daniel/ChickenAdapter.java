package fi.daniel;

public class ChickenAdapter implements Dinosaur {

    private Chicken chicken;

    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void roar() {
        chicken.makeNoise();
    }
}
