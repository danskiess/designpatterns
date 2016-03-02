package fi.daniel;

public class OldGamer implements Gamer {

    @Override
    public void startPlaying() {
        System.out.println(getClass().getSimpleName() + " starts playing after morning coffee");
    }

    @Override
    public void stopPlaying() {
        System.out.println(getClass().getSimpleName() + " stops playing and goes to sleep.");
    }
}
