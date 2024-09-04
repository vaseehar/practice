package unknown;

public class GuessGame {

    public static int guess(int num) {
        int pick = 6;
        if (num > pick)
            return -1;
        else if (num < pick)
            return 1;
        else
            return 0;
    }
}
