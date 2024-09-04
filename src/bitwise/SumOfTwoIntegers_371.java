package bitwise;

public class SumOfTwoIntegers_371 {

    public static void main(String arg[]) {
        System.out.println(new SumOfTwoIntegers_371().getSum(-15, 32));
    }

    public int getSum(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

}
