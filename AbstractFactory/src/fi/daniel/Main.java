package fi.daniel;

/**
 * Type: Creational pattern
 * Intent: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 */
public class Main {

    public static void main(String[] args) {
        GameFactory gameFactory;
        GamePad gamePad;
        Game popularGame;
        Game unPopularGame;

        gameFactory = new PlaystationFactory();
        gamePad = gameFactory.createGamePad();
        System.out.println(gamePad.getDescription());
        popularGame = gameFactory.createPopularGame();
        System.out.println(popularGame.toString());
        unPopularGame = gameFactory.createUnPopularGame();
        System.out.println(unPopularGame.toString());

        gameFactory = new XboxFactory();
        gamePad = gameFactory.createGamePad();
        System.out.println(gamePad.getDescription());
        popularGame = gameFactory.createPopularGame();
        System.out.println(popularGame.toString());
        unPopularGame = gameFactory.createUnPopularGame();
        System.out.println(unPopularGame.toString());
    }
}
