package fi.daniel;

import java.util.HashMap;

public class PlayerFactory {

    private HashMap<Color, Bot> botHashMap = new HashMap<>();

    public Bot getBot(Color color){
        Bot bot = botHashMap.get(color);

        if (bot == null) {
            System.out.println("Made new bot with color: " + color);
            bot = new Bot(color);
            botHashMap.put(color, bot);
        }
        return bot;
    }
}
