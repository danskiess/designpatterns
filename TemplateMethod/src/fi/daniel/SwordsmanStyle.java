package fi.daniel;

public class SwordsmanStyle extends CombatStyle {
    @Override
    public void arm() {
        System.out.println("Equips sword");
    }

    @Override
    public void attack() {
        System.out.println("Swings sword!");
    }

    @Override
    public void dance() {
        System.out.println("Dances really hard");
    }
}
