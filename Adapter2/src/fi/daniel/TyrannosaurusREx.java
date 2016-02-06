package fi.daniel;

public class TyrannosaurusREx implements Dinosaur{

    @Override
    public void roar() {
        System.out.println(getClass().getSimpleName() + " roars!");
    }
}
