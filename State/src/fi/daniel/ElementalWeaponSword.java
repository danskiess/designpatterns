package fi.daniel;

import fi.daniel.elements.*;

public class ElementalWeaponSword implements ElementalWeapon {

    private ElementalState currentState;

    private ElementalState earthState;
    private ElementalState fireState;
    private ElementalState windState;
    private ElementalState waterState;
    private ElementalState heartState;

    private int elementCounter;

    @Override
    public void attack() {
        if (currentState instanceof EarthState) {
            setElementalState(ElementalStateEnum.FIRE);
        } else if (currentState instanceof FireState) {
            setElementalState(ElementalStateEnum.WIND);
        } else if (currentState instanceof WindState) {
            setElementalState(ElementalStateEnum.WATER);
        } else if (currentState instanceof WaterState) {
            setElementalState(ElementalStateEnum.HEART);
        } else {
            setElementalState(ElementalStateEnum.EARTH);
        }

        System.out.println("Attacks with: " + currentState.getState() + " sword!");
    }

    @Override
    public void setElementalState(ElementalStateEnum elementalState) {
        switch (elementalState) {
            case EARTH:
                    currentState = new EarthState();
                break;
            case FIRE:
                    currentState = new FireState();
                break;
            case WIND:
                    currentState = new WindState();
                break;
            case WATER:
                    currentState = new WaterState();
                break;
            case HEART:
                    currentState = new HeartState();
                break;
        }
    }
}
