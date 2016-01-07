package fi.daniel;

public class PlaystationFactory implements GameFactory {

    @Override
    public Game createPopularGame() {
        return new PlaystationGame("Tekken");
    }

    @Override
    public Game createUnPopularGame() {
        return new PlaystationGame("PiratesOfCaribbean");
    }

    @Override
    public GamePad createGamePad() {
        return new PlaystationGamePad();
    }
}
