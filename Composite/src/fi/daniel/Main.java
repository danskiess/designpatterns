package fi.daniel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Soldier general = new General(new ArrayList<>());
        Soldier secondInCommand = new SecondInCommand(new ArrayList<>());
        general.add(secondInCommand);
        Soldier soldier1 = new Trooper();
        Soldier soldier2 = new Trooper();
        Soldier soldier3 = new Trooper();
        secondInCommand.add(soldier1);
        secondInCommand.add(soldier2);
        secondInCommand.add(soldier3);
        general.attack();
    }
}
