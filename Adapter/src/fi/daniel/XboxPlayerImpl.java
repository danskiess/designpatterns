package fi.daniel;


//Client
public class XboxPlayerImpl implements XboxPlayer {

    //Adapter
    private GameController gameController;

    public XboxPlayerImpl(GameController gameController) {
        this.gameController = gameController;
    }

    @Override
    public void pressA() {
        gameController.pressA();
    }

    @Override
    public void pressX() {
        gameController.pressX();
    }

    @Override
    public void pressY() {
        gameController.pressY();
    }

    @Override
    public void pressB() {
        gameController.pressB();
    }
}
