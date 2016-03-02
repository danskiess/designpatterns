package fi.daniel;

public class YoungGamer implements Gamer {

    @Override
    public void startPlaying() {
        System.out.println(getClass().getSimpleName() + " grabs energy drink starts playing");
    }

    @Override
    public void stopPlaying() {
        System.out.println(getClass().getSimpleName() + " stops playing and goes to rave");
    }
}
