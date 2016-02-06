package fi.daniel;

public class PlayerWithEnergyDrink extends PlayerDecorator{

    public PlayerWithEnergyDrink(Player decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        System.out.println("WITH THE POWER OF ENERGY DRINK");
    }
}
