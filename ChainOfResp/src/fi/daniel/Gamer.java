package fi.daniel;

public abstract class Gamer {

    protected Gamer gamer;

    public void setSuperiorGamer(Gamer gamer){
        this.gamer = gamer;
    }

    public abstract void play(Game game);
}
