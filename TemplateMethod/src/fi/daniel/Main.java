package fi.daniel;

public class Main {

    public static void main(String[] args) {
        Hero elfHero = new ElfHero(new ArcherStyle());
        elfHero.fight();
        elfHero.setCombatStyle(new SwordsmanStyle());
        elfHero.fight();
    }
}
