package fi.daniel;

public class Game {

    private GameDifficulty gameDifficulty;

    public Game(GameDifficulty gameDifficulty) {
        this.gameDifficulty = gameDifficulty;
    }

    public GameDifficulty getGameDifficulty() {
        return gameDifficulty;
    }
}
