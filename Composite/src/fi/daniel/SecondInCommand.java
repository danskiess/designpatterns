package fi.daniel;

import java.util.List;

public class SecondInCommand implements Soldier {

    private List<Soldier> soldiers;

    public SecondInCommand(List<Soldier> soldiers) {
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
        System.out.println("SecondInCommand commands soldiers and follows up!");
        for (Soldier soldier: soldiers) {
            soldier.attack();
        }
    }
}
