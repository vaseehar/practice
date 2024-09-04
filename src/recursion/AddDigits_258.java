package recursion;

public class AddDigits_258 {

    public static void main(String[] args) {
        System.out.println(new AddDigits_258().addDigits(123));
    }

    public int addDigits(int num) {
        if (num < 10)
            return num;
        return addDigitsRe(num);

    }

    public int addDigitsRe(int n) {
        if (n / 10 < 1)
            return n;
        int result = addDigitsRe(n / 10) + addDigitsRe(n % 10);
        if (result / 10 >= 1) {
            return addDigitsRe(result);
        } else {
            return result;
        }
    }

    // easy solution found in discussion
    public int addDigits1(int num) {
        if (num == 0)
            return num;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }

}
