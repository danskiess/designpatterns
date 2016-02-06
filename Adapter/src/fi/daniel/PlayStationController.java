package fi.daniel;

public class PlayStationController implements GameController {

    @Override
    public void pressA() {
        System.out.println("Press A -> X");
    }

    @Override
    public void pressX() {
        System.out.println("Press X -> Square");
    }

    @Override
    public void pressY() {
        System.out.println("Press Y -> Triangle");
    }

    @Override
    public void pressB() {
        System.out.println("Press B -> Circle");
    }
}
