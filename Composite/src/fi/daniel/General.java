package fi.daniel;

import java.util.List;

public class General implements Soldier {

    List<Soldier> soldiers;

    public General(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public void add(Soldier soldier) {
        soldiers.add(soldier);
    }

    @Override
    public void get(Soldier soldier) {
        soldier.get(soldier);
    }

    @Override
    public void remove(Soldier soldier) {
        soldier.remove(soldier);
    }

    @Override
    public void attack() {
        if (soldiers.isEmpty()) return;
        System.out.println("General commands soldiers!");
        for (Soldier soldier: soldiers) {
            soldier.attack();
        }
    }
}
