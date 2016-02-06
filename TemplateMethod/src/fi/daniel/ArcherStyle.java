package fi.daniel;

public class ArcherStyle extends CombatStyle {

    @Override
    public void arm() {
        System.out.println("Equips bow");
    }

    @Override
    public void attack() {
        System.out.println("Attacks with great precision!");
    }

    @Override
    public void dance() {
        System.out.println("Dances like a girl");
    }
}
