package fi.daniel;

public abstract class CombatStyle {

    public void fight(){
        arm();
        attack();
        dance();
    }

    public abstract void arm();
    public abstract void attack();
    public abstract void dance();
}
