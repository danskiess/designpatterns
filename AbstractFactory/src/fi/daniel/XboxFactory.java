package fi.daniel;

public class XboxFactory implements GameFactory {

    @Override
    public Game createPopularGame() {
        return new XboxGame("Pokemon");
    }

    @Override
    public Game createUnPopularGame() {
        return new XboxGame("Trolls and wizards");
    }

    @Override
    public GamePad createGamePad() {
        return new XboxGamePad();
    }
}
