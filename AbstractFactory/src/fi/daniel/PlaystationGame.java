package fi.daniel;

import com.sun.javafx.beans.annotations.NonNull;

public class PlaystationGame implements Game {

    private final String name;

    public PlaystationGame(@NonNull  String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Game: " + name + ", type: " + this.getClass().getSimpleName();
    }
}
