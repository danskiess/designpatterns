package fi.daniel;

public class Bot implements Player {

    private Color color;
    int x, y;

    public Bot(Color color) {
        this.color = color;
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void play() {
        System.out.println(color.name() + " bot playing! Moving to " + x + ", " + y);
    }
}
