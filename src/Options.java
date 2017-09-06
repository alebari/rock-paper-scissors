/**
 * Created by Alessandra on 06.09.2017.
 */

public enum Options {
    PAPER,
    SCISSOR,
    ROCK;

    public static Options getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
