package fi.daniel;

public class Main {

    public static void main(String[] args) {
        Gamer beginnerGamer = new BeginnerGamer();
        Gamer casualGamer = new CasualGamer();
        Gamer proGamer = new ProGamer();

        beginnerGamer.setSuperiorGamer(casualGamer);
        casualGamer.setSuperiorGamer(proGamer);

        System.out.println("Easy game");
        Game easyGame = new Game(GameDifficulty.EASY);
        beginnerGamer.play(easyGame);

        System.out.println("Normal game");
        Game normalGame = new Game(GameDifficulty.NORMAL);
        beginnerGamer.play(normalGame);

        System.out.println("Hard game");
        Game hardGame = new Game(GameDifficulty.HARD);
        beginnerGamer.play(hardGame);

    }
}
