import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will calculate prime numbers from 0 to the number which you entered");
        System.out.print("Please Enter a number: ");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            int count = 0;
            int i = 2;
            for (int h = 2; h <= n; h++) {
                while (i < h) {
                    if (h % i == 0) {
                        count++;
                    }
                    i++;
                }
                i = 2;
                if (count == 0) {
                    System.out.print(h + ", ");
                }
                count = 0;
            }
            System.out.println("\b\b");
        } else {
            System.out.println("Please enter positive integer...");
        }
    }
}