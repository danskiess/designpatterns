package fi.daniel;

public class Main {

    public static void main(String[] args) {
        GameController gameController = new PlayStationController();
        XboxPlayer xboxPlayer = new XboxPlayerImpl(gameController);
        xboxPlayer.pressA();
        xboxPlayer.pressX();
        xboxPlayer.pressY();
        xboxPlayer.pressB();
    }
}
