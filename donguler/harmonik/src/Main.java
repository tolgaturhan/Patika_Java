import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 + 1/2 + 1/3 + 1/4 + 1/n
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int number = scan.nextInt();
        double total = 0;

        for (int i = 1; i <= number; i++){
            total += 1.0 / i;
        }
        System.out.println(total);
    }
}
