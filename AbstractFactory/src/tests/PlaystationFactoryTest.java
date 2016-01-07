import fi.daniel.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

public class PlaystationFactoryTest {

    private GameFactory playstationFactory;

    @Before
    public void init(){
        playstationFactory = new PlaystationFactory();
    }

    @Test
    public void shouldReturnInstanceOfPlaystationGamePad(){
        GamePad gamePad = playstationFactory.createGamePad();
        assertThat("GamePad is type of PlaystationGamePad", gamePad, instanceOf(PlaystationGamePad.class));
    }

    @Test
    public void popularGameShouldReturnTekken(){
        Game game = playstationFactory.createPopularGame();
        assertTrue("Game's name should be Tekken, but is: " + game.getName(), game.getName().equals("Tekken"));
    }

    @Test
    public void unpopularGameShouldReturnPiratesOfCaribbean(){
        Game game = playstationFactory.createUnPopularGame();
        assertTrue("Game's name should be PiratesOfCaribbean, but is: " + game.getName(), game.getName().equals("PiratesOfCaribbean"));
    }

}