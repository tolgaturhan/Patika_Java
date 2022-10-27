import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, nFac = 1, rFac = 1, nrFac = 1;

        System.out.print("1. Küme Eleman Sayısını Giriniz: ");
        n = scan.nextInt();
        System.out.print("2. Küme Eleman Sayısını Giriniz: ");
        r = scan.nextInt();

        if (n >= 0 && r >= 0) {
            if (n > 0 && n >= r) {
                for (int i = 1; i <= n; i++) {
                    nFac *= i;
                }
                System.out.println("(n) Faktöriyel = " + nFac);

                for (int j = 1; j <= r; j++) {
                    rFac *= j;
                }
                System.out.println("(r) Faktöriyel = " + rFac);

                for (int k = 1; k <= (n - r); k++) {
                    nrFac *= k;
                }
                System.out.println("C(n,r) Kombinasyonu = " + nFac / (rFac * nrFac));
            }
            if (n == 0 || r > n) {
                if (n == 0) {
                    System.out.println("1. Küme Eleman Sayısı Sıfır (0) Olamaz...");
                } else {
                    System.out.println("2. Küme Eleman Sayısı 1.'den büyük Olamaz...");
                }
            }
        } else {
            System.out.println("Eleman Sayısı Eksi (-) Olamaz...");
        }
    }
}