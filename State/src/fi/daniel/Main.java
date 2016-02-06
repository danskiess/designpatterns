package fi.daniel;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Steve", new ElementalWeaponSword());
        for (int i = 0; i < 30; i++) {
            hero.attack();
        }
    }
}
