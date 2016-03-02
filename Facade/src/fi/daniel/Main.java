package fi.daniel;

public class Main {

    public static void main(String[] args) {
        GameSession gameSession = new GameSession(new Console(), new Game(), new Gamer());
        gameSession.startSession();
    }
}
