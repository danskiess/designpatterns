package fi.daniel;

public class Main {

    public static void main(String[] args) {
        Dinosaur dinosaur = new TyrannosaurusREx();
        dinosaur.roar();

        Chicken chicken = new Chicken();
        Dinosaur chickenAdapter = new ChickenAdapter(chicken);
        chickenAdapter.roar();
    }
}
