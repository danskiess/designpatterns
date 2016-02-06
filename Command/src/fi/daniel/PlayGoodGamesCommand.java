package fi.daniel;

public class PlayGoodGamesCommand implements Command {

    private XboxGamer xboxGamer;

    public PlayGoodGamesCommand(XboxGamer xboxGamer) {
        this.xboxGamer = xboxGamer;
    }

    @Override
    public void execute() {
        xboxGamer.play("Play some playstation game!");
    }
}
