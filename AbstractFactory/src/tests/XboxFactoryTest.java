import fi.daniel.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

public class XboxFactoryTest {

    private GameFactory xboxFactory;

    @Before
    public void init(){
        xboxFactory = new XboxFactory();
    }

    @Test
    public void shouldReturnInstanceOfPlaystationGamePad(){
        GamePad gamePad = xboxFactory.createGamePad();
        assertThat("GamePad should be type of XboxGamePad", gamePad, instanceOf(XboxGamePad.class));
    }

    @Test
    public void popularGameShouldReturnTekken(){
        Game game = xboxFactory.createPopularGame();
        assertTrue("Game's name should be Pokemon, but is: " + game.getName(), game.getName().equals("Pokemon"));
    }

    @Test
    public void unpopularGameShouldReturnPiratesOfCaribbean(){
        Game game = xboxFactory.createUnPopularGame();
        assertTrue("Game's name should be Trolls and wizards, but is: " + game.getName(), game.getName().equals("Trolls and wizards"));
    }
}