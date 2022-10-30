import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n, n1, hn = 0, ln = 0;
        System.out.print("Please enter how many numbers to enter: ");
        n = num.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("Number " + i + ": ");
            n1 = num.nextInt();
            if (i == 1){
                hn = n1;
                ln = n1;
            } else {
                if (n1 > hn) {
                    hn = n1;
                } else if (n1 < ln){
                    ln = n1;
                }
            }
        }
        System.out.println("Lowest Number Is: " + ln);
        System.out.println("Highest Number Is: " + hn);
    }
}