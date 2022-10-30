import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This program checks the number which you enter is perfect or not
        Scanner num = new Scanner(System.in);
        int i = 1, total = 0;
        System.out.print("Select number: ");
        if (num.hasNextInt()) {
            int n = num.nextInt();
            do {
                if (n % i == 0) {
                    total += i;
                }
                i++;
            } while (i < n);

            if (total == n) {
                System.out.println(n + " is a perfect number");
            } else {
                System.out.println(n + " is not a perfect number");
            }
        } else {
            System.out.println("Please enter integer...");
        }
    }
}