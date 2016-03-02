package fi.daniel;

public class CasualGamer extends Gamer {

    @Override
    public void play(Game game) {
        if (game.getGameDifficulty() == GameDifficulty.NORMAL){
            System.out.println(getClass().getSimpleName() + ": Hey, I can beat this");
        } else {
            gamer.play(game);
        }
    }
}
