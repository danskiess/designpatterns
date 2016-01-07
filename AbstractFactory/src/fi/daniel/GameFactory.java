package fi.daniel;

public interface GameFactory {
    Game createPopularGame();
    Game createUnPopularGame();
    GamePad createGamePad();
}
