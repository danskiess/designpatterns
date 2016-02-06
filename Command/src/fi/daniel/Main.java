package fi.daniel;

public class Main {

    public static void main(String[] args) {
        XboxGamer xboxGamer = new XboxGamer();
        Command playBadGamesCommand = new PlayBadGamesCommand(xboxGamer);
        Command playGoodGamesCommand = new PlayGoodGamesCommand(xboxGamer);

        GamerGuru gamerGuru = new GamerGuru();
        gamerGuru.tellXboxGamerWhatToDo(playBadGamesCommand);
        gamerGuru.tellXboxGamerWhatToDo(playGoodGamesCommand);
    }
}
