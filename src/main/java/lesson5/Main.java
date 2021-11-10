package lesson5;

//Ex.1 (only for positive integers)
public class Main {

    public static void main(String[] args) {

        System.out.println(exponentiation(2, 5));
        System.out.println(recExponentiation(2, 5));

    }

    public static int exponentiation(int a, int b) {
        int r = 0;
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }

        while (b > 1) {
            if (r == 0) {
                r = a * a;
            } else {
                r *= a;
            }
            b--;
        }
        return r;
    }

    public static int recExponentiation(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return recExponentiation(a, b - 1) * a;
        }
    }
}
