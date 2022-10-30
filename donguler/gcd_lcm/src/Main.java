import java.util.*;

public class Main {
    public static void main(String[] args) {
        // GCD = Greatest Common Divisor
        // LCM = Lowest Common Multiple
        Scanner scan = new Scanner(System.in);
        int n1, n2, swap, i = 1, gcd = 1;
        System.out.print("First Number: ");
        n1 = scan.nextInt();
        System.out.print("Second Number: ");
        n2 = scan.nextInt();
        swap = n1;
        if (n2 < n1) {
            n1 = n2;
            n2 = swap;
        }
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("GCD (" + n1 + ", " + n2 + "): " + gcd);
        System.out.println("LCM (" + n1 + ", " + n2 + "): " + n1 * n2 / gcd);
    }
}