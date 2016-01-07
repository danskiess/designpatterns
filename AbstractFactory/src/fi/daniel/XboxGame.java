package fi.daniel;

import com.sun.javafx.beans.annotations.NonNull;

public class XboxGame implements Game {

    private final String name;

    public XboxGame(@NonNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Game: " + name + ", type: " + this.getClass().getSimpleName();
    }
}
