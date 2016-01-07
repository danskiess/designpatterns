package fi.daniel;

import com.sun.istack.internal.NotNull;

public enum  MealType {

    SOUP("Soup"), MAIN("Main"), DESSERT("Dessert");

    private String title;

    MealType(@NotNull String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
