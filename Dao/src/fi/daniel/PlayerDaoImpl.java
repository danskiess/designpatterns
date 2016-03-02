package fi.daniel;

import java.util.List;

public class PlayerDaoImpl implements PlayerDao {

    private List<Player> players;

    public PlayerDaoImpl(List<Player> players) {
        this.players = players;
    }

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public Player getPlayerById(int id) {
        for (Player player : players) {
            if (id == player.getId()) {
                return player;
            }
        }
        return null;
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void updatePlayer(Player player) {
        int index = players.indexOf(player);
        players.set(index, player);
    }

    @Override
    public void deletePlayer(Player player) {
        players.remove(player);
    }
}
