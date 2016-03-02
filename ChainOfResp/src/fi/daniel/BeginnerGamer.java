package fi.daniel;

public class BeginnerGamer extends Gamer {
    @Override
    public void play(Game game) {
        if (game.getGameDifficulty() == GameDifficulty.EASY){
            System.out.println(getClass().getSimpleName() + ": Hey, I can beat this");
        } else {
            gamer.play(game);
        }
    }
}
