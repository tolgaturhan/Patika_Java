import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k, l;
        int total = 1;

        System.out.print("Üssü Alınacak Sayı: ");
        k = scan.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        l = scan.nextInt();

        if (l >=0) {
            for (int i = 1; i <= l; i++) {
                total *= k;
            }
            System.out.println(total);
        } else {
            l = Math.abs(l);
            for (int i = 1; i <= l; i++) {
                total *= k;
            }
            System.out.println(1/ (double) total);
        }
    }
}