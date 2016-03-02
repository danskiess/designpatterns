package fi.daniel;

import java.util.List;

public class PlayStationHouse implements GameHouse {

    List<Gamer> gamerList;

    public PlayStationHouse(List<Gamer> gamerList) {
        this.gamerList = gamerList;
    }

    @Override
    public void open() {
        System.out.println("Open " + getClass().getSimpleName() + ", game of today is Tekken!");
        for(Gamer gamer : gamerList){
            gamer.startPlaying();
        }
    }

    @Override
    public void close() {
        System.out.println("Close " + getClass().getSimpleName());
        for(Gamer gamer : gamerList){
            gamer.stopPlaying();
        }
    }
}
