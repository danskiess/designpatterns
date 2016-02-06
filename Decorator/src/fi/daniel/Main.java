package fi.daniel;

public class Main {

    public static void main(String[] args) {

        Player player = new XboxPlayer();
        player.play();

        PlayerDecorator decoratedPlayer = new PlayerWithEnergyDrink(player);
        decoratedPlayer.play();
    }
}
