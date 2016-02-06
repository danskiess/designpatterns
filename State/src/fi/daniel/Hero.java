package fi.daniel;

import fi.daniel.elements.*;

public class Hero {

    private String name;
    private Weapon weapon;

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void attack(){
        weapon.attack();
    }
}
