package fi.daniel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Gamer> gamerList = new ArrayList<>();
        gamerList.add(new YoungGamer());
        gamerList.add(new OldGamer());

        GameHouse gameHouse = new XboxHouse(gamerList);
        gameHouse.open();
        System.out.println("---");
        gameHouse.close();
        System.out.println("---");
        System.out.println("---");
        gameHouse = new PlayStationHouse(gamerList);
        gameHouse.open();
        System.out.println("---");
        gameHouse.close();
    }
}
