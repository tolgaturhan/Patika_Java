import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Digit Number: ");
        if (scan.hasNextInt()) {
            int b = scan.nextInt();
            if (b > 0) {
                int n = b;

                for (int i = 0; i <= b - 1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * n - 1; k++) {
                        System.out.print("*");
                    }
                    n -= 1;
                    System.out.println("");
                }
            } else {
                System.out.println("Please enter positive integer...");
            }
        } else {
            System.out.println("Please enter positive integer...");
        }
    }
}