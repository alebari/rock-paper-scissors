/**
 * Created by Alessandra on 06.09.2017.
 */
public class Rules {

    public Result compareInput(Options player1, Options player2) {
        switch (player1) {
            case PAPER:
                if (player2 == Options.SCISSOR) {
                    return Result.LOST;
                } else if (player2 == Options.ROCK) {
                    return Result.WON;
                } else {
                    return Result.DRAW;
                }
            case SCISSOR:
                if (player2 == Options.PAPER) {
                    return Result.WON;
                } else if (player2 == Options.ROCK) {
                    return Result.LOST;
                } else {
                    return Result.DRAW;
                }
            case ROCK:
                if (player2 == Options.SCISSOR) {
                    return Result.WON;
                } else if (player2 == Options.PAPER) {
                    return Result.LOST;
                } else {
                    return Result.DRAW;
                }
            default:
                return Result.UNKNOWN;
        }
    }
}
