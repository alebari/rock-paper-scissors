import java.util.Random;

/**
 * Created by Alessandra on 06.09.2017.
 */
public class Game {

    private int player1Won = 0;
    private int player2Won = 0;
    private int draw = 0;

    public void startGame() {
        Rules rules = new Rules();

        for (int i = 0; i < 100; i++) {
            Result result = rules.compareInput(Options.ROCK, Options.getRandom());
            switch (result) {
                case WON:
                    player1Won++;
                    break;
                case LOST:
                    player2Won++;
                    break;
                case DRAW:
                    draw++;
            }
        }
    }

    public void resetGame() {
        player1Won = 0;
        player2Won = 0;
        draw = 0;
    }

    public int getPlayer1Won() {
        return player1Won;
    }

    public int getPlayer2Won() {
        return player2Won;
    }

    public int getDraw() {
        return draw;
    }
}
