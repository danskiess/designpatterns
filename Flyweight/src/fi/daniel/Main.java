package fi.daniel;

public class Main {

    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();
        Bot bot = playerFactory.getBot(Color.BLUE);
        bot.moveTo(10, 5);
        bot.play();

        Bot bot1 = playerFactory.getBot(Color.BLUE);
        bot1.moveTo(5, 20);
        bot1.play();

        Bot bot2 = playerFactory.getBot(Color.RED);
        bot2.moveTo(22, 15);
        bot2.play();

        Bot bot3 = playerFactory.getBot(Color.RED);
        bot3.moveTo(222, 15);
        bot3.play();

        Bot bot4 = playerFactory.getBot(Color.GREEN);
        bot4.moveTo(22, 15);
        bot4.play();

        Bot bot5 = playerFactory.getBot(Color.GREEN);
        bot5.moveTo(202, 115);
        bot5.play();

        Bot bot6 = playerFactory.getBot(Color.BLUE);
        bot6.moveTo(22222, 2);
        bot6.play();
    }
}
