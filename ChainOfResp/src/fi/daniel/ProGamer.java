package fi.daniel;

public class ProGamer extends Gamer{

    @Override
    public void play(Game game) {
        if (game.getGameDifficulty() == GameDifficulty.HARD){
            System.out.println(getClass().getSimpleName() + ": Hey, I can beat this");
        }
    }
}
