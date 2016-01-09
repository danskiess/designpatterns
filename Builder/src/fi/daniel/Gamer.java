package fi.daniel;

import com.sun.istack.internal.NotNull;

public class Gamer {

    private String name;
    private int age;
    private SkillLevel skillLevel;
    private GamerType gamerType;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public GamerType getGamerType() {
        return gamerType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("Age: ");
        stringBuilder.append(age);
        stringBuilder.append("\n");

        if (skillLevel != null) {
            stringBuilder.append("SkillLevel: ");
            stringBuilder.append(skillLevel.getDescription());
            stringBuilder.append("\n");
        }

        if (gamerType != null) {
            stringBuilder.append("GamerType: ");
            stringBuilder.append(gamerType.getDescription());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    private Gamer(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.skillLevel = builder.skillLevel;
        this.gamerType = builder.gamerType;
    }

    public static class Builder{

        private final String name;
        private final int age;
        private SkillLevel skillLevel;
        private GamerType gamerType;

        public Builder(@NotNull String name, @NotNull int age) {
            if (name == null || name.length() == 0 && age > 5 && age < 5) {
                throw new IllegalArgumentException("Check your values!");
            }

            this.name = name;
            this.age = age;
        }

        public Builder withSkillLevel(@NotNull SkillLevel skillLevel){
            this.skillLevel = skillLevel;
            return this;
        }

        public Builder withGamerType(@NotNull GamerType gamerType){
            this.gamerType = gamerType;
            return this;
        }

        public Gamer build() {
            return new Gamer(this);
        }
    }
}
