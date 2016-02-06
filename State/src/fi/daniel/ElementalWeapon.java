package fi.daniel;

import fi.daniel.elements.ElementalStateEnum;

public interface ElementalWeapon extends Weapon {
    void setElementalState(ElementalStateEnum elementalState);
}
