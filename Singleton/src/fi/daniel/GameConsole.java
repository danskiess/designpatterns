package fi.daniel;

public class GameConsole {

    private static GameConsole gameConsoleInstance;

    public static GameConsole getInstance(){
        if (gameConsoleInstance == null) {
            gameConsoleInstance = new GameConsole();
        }
        return gameConsoleInstance;
    }

    private Game game;

    private GameConsole(){}

    public void insertGame(Game game){
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
