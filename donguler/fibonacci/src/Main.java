import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        if (scan.hasNextInt()) {
            int digit = scan.nextInt();
            int first = 1;
            int total;
            int fib = 0;
            if (digit > 0) {
                System.out.print("Fibonacci Series: " );
                for (int i = 1; i <= digit + 1; i++) {
                    total = first + fib;
                    System.out.print(fib + ", ");
                    fib = first;
                    first = total;
                }
                System.out.println("\b\b");
            } else {
                System.out.println("Please enter a positive integer value...");
            }
        } else {
            System.out.println("Please enter a positive integer value...");
        }
    }
}