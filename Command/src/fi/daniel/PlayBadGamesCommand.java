package fi.daniel;

public class PlayBadGamesCommand implements Command {

    private XboxGamer xboxGamer;

    public PlayBadGamesCommand(XboxGamer xboxGamer) {
        this.xboxGamer = xboxGamer;
    }

    @Override
    public void execute() {
        xboxGamer.play("Play some xbox game!");
    }
}
