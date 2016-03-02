package fi.daniel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Player(21, "Daniel", 40));
        players.add(new Player(11, "John", 80));
        players.add(new Player(3, "Data", 55));
        players.add(new Player(44, "Louise", 23));
        players.add(new Player(55, "Leia", 60));

	    PlayerDao playerDao = new PlayerDaoImpl(players);

        for (Player player : playerDao.getAllPlayers()){
            System.out.println(player.toString());
        }

        Player daniel = playerDao.getPlayerById(21);
        System.out.println("Who's here: " + daniel.toString());

        playerDao.deletePlayer(daniel);

        for (Player player : playerDao.getAllPlayers()){
            System.out.println(player.toString());
        }

        playerDao.addPlayer(new Player(41, "UpdatedDaniel", 40));

        for (Player player : playerDao.getAllPlayers()){
            System.out.println(player.toString());
        }

        Player updatedDaniel = playerDao.getPlayerById(41);
        updatedDaniel.setAge(100);
        playerDao.updatePlayer(updatedDaniel);
        System.out.println("Who's here: " + playerDao.getPlayerById(41).toString());
    }
}
