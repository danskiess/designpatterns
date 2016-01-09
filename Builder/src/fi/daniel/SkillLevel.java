package fi.daniel;

import com.sun.istack.internal.NotNull;

public enum SkillLevel {

    NOVICE("Novice"), AMATEUR("Amateur"), PRO("Pro");

    private final String description;

    SkillLevel(@NotNull String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
