package fi.daniel;

public abstract class PlayerDecorator implements Player {

    protected Player decoratedPlayer;

    public PlayerDecorator(Player decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }
}
