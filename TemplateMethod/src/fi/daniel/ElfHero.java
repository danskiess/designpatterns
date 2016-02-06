package fi.daniel;

public class ElfHero implements Hero {

    private CombatStyle combatStyle;

    public ElfHero(CombatStyle combatStyle) {
        this.combatStyle = combatStyle;
    }

    @Override
    public void fight() {
        combatStyle.fight();
    }

    @Override
    public void setCombatStyle(CombatStyle combatStyle) {
        this.combatStyle = combatStyle;
    }
}
