package fi.daniel;

public class GameSession {

    private Console console;
    private Game game;
    private Gamer gamer;

    public GameSession(Console console, Game game, Gamer gamer) {
        this.console = console;
        this.game = game;
        this.gamer = gamer;
    }

    public void startSession(){
        console.turnOn();
        game.loadSave();
        gamer.play();
    }
}
