package fi.daniel;

public class Main {

    public static void main(String[] args) {

        String gameTitle;
        GameConsole gameConsole = GameConsole.getInstance();
        gameTitle = (gameConsole.getGame() == null ? "No game" : gameConsole.getGame().getTitle());
        System.out.println("Game name: " + gameTitle);

        gameConsole.insertGame(new ActionGame());
        gameTitle = gameConsole.getGame().getTitle();
        System.out.println("Game name: " + gameTitle);

        GameConsole gameConsole1 = GameConsole.getInstance();
        gameConsole.insertGame(new RPGGame());
        gameTitle = gameConsole1.getGame().getTitle();
        System.out.println("Game name: " + gameTitle);
    }
}
