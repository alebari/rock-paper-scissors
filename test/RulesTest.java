import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Alessandra on 06.09.2017.
 */
public class RulesTest {

    @Test
    public void testCompareRock(){
        Rules rules = new Rules();

        assertEquals(Result.DRAW, rules.compareInput(Options.ROCK, Options.ROCK));
        assertEquals(Result.WON, rules.compareInput(Options.ROCK, Options.SCISSOR));
        assertEquals(Result.LOST, rules.compareInput(Options.ROCK, Options.PAPER));
    }

    @Test
    public void testCompareScissor(){
        Rules rules = new Rules();

        assertEquals(Result.DRAW, rules.compareInput(Options.SCISSOR, Options.SCISSOR));
        assertEquals(Result.WON, rules.compareInput(Options.SCISSOR, Options.PAPER));
        assertEquals(Result.LOST, rules.compareInput(Options.SCISSOR, Options.ROCK));
    }

    @Test
    public void testComparePaper(){
        Rules rules = new Rules();

        assertEquals(Result.DRAW, rules.compareInput(Options.PAPER, Options.PAPER));
        assertEquals(Result.WON, rules.compareInput(Options.PAPER, Options.ROCK));
        assertEquals(Result.LOST, rules.compareInput(Options.PAPER, Options.SCISSOR));
    }
}
