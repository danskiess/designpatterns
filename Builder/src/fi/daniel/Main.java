package fi.daniel;

public class Main {

    public static void main(String[] args) {

        Gamer casualGamer = new Gamer.Builder("Daniel", 28)
                .withGamerType(GamerType.PC)
                .withSkillLevel(SkillLevel.AMATEUR)
                .build();

        System.out.println(casualGamer.toString());

        Gamer anotherGamer = new Gamer.Builder("Charles", 15)
                .withSkillLevel(SkillLevel.PRO)
                .build();

        System.out.println(anotherGamer.toString());

        Gamer consoleGamerWithNoSkills = new Gamer.Builder("Jeff", 55)
                .withGamerType(GamerType.CONSOLE)
                .build();

        System.out.println(consoleGamerWithNoSkills.toString());

        Gamer guy = new Gamer.Builder("Guy", 33)
                .build();

        System.out.println(guy.toString());

        Gamer.Builder builder = new Gamer.Builder("Builder", 12);
        builder.withGamerType(GamerType.PC);
        builder.withSkillLevel(SkillLevel.AMATEUR);
        Gamer gamer = builder.build();

        System.out.println(gamer.toString());
    }
}
