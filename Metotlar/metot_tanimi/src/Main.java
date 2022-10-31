public class Main {

    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    static void helloWorld() {
        System.out.println("// Merhaba, Test...");
    }

    public static void main(String[] args) {
        /* f(x) = 2x + 3 => f(6) = 2*6 + 3 = 15
           f(x,y,z) = 3x + 2y + z => f(4,2,7) = 4*3 + 2*2 + 7 = 23

        int base = 2, exp = 3, result = 1;
        // First exponentiation
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(result);
        // Second exponentiation
        base = 4;
        exp = 2;
        result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(result); */

        int case1 = power(4, 3);
        System.out.println(case1);

        System.out.println(power(2, 3));

        int n1 = 2, n2 = 3;
        System.out.println(power(n1, n2));

        helloWorld();
        helloWorld();
        helloWorld();
    }
}