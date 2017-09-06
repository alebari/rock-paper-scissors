import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Alessandra on 06.09.2017.
 */
public class GameTest {

    @Test
    public void testStartGame() {
        Game game = new Game();

        assertEquals(0, game.getPlayer1Won() + game.getPlayer2Won() + game.getDraw());

        game.startGame();

        assertEquals(100, game.getPlayer1Won() + game.getPlayer2Won() + game.getDraw());
    }

    @Test
    public void testResetGame() {
        Game game = new Game();

        assertEquals(0, game.getPlayer1Won() + game.getPlayer2Won() + game.getDraw());

        game.startGame();

        assertEquals(100, game.getPlayer1Won() + game.getPlayer2Won() + game.getDraw());

        game.resetGame();

        assertEquals(0, game.getPlayer1Won() + game.getPlayer2Won() + game.getDraw());
    }
}
