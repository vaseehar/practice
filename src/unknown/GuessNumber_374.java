package unknown;

public class GuessNumber_374 extends GuessGame {

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        int low = 1, high = n, mid = n;
        while (guess(mid) != 0) {
            mid = low + (high - low) / 2;
            if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return mid;
    }

}
