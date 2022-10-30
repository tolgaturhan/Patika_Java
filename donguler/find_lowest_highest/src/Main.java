import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        int n1;
        int sn = 0;
        int ln = 0;
        System.out.print("Please enter how many numbers to enter: ");

        if (num.hasNextInt()) {
            n = num.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("Number " + i + ": ");
                if (num.hasNextInt()) {
                    n1 = num.nextInt();
                    if (i == 1) {
                        ln = n1;
                        sn = n1;
                    } else {
                        if (n1 > ln) {
                            ln = n1;
                        } else if (n1 < sn) {
                            sn = n1;
                        }
                    }
                } else {
                    System.out.println("Please enter positive integer...");
                    sn = 0;
                    ln = 0;
                    break;
                }
            }
            System.out.println("Smallest Number Is: " + sn);
            System.out.println("Largest Number Is: " + ln);
        } else {
            System.out.println("Please enter positive integer...");
        }
    }
}