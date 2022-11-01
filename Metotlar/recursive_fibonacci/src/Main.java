import java.util.Scanner;

public class Main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* f(n) = f(n-1) + f(n-2)
           f(6) = f(5) + f(4)
           f(5) = f(4) + f(3)
           f(4) = f(3) + f(2)
           f(3) = f(2) + f(1)
           f(2) = f(1) + f(0)
           f(1) = 1
           f(0) = 0
        */
        System.out.println("Welcome To Fibonacci Number Generator" + "\n-------------------------------------");
        System.out.print("Please Enter The Fibonacci Sequence: ");
        int digit = scan.nextInt();
        int total = fib(digit);
        System.out.println("Fibonacci Number: " + total + "\n-------------------------------------");
    }
}
        /*
        System.out.print("Please enter the number you want to start the series with: ");
        int num = scan.nextInt();
        int total2 = fib(num);
        System.out.println("Total: " + (total - total2));
        */