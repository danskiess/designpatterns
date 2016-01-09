package fi.daniel;

import com.sun.istack.internal.NotNull;

public enum GamerType {

    PC("Pc gamer"), CONSOLE("Console gamer"), BOARDGAME("Boardgamer");

    private final String description;

    GamerType(@NotNull String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
