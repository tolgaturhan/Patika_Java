import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int total = 0;
        int sayac = 0;
        System.out.print("Sayı girin: ");

        if (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num > 12) {
                System.out.print("3'e ve 4'e Bölünebilen Sayılar\t: ");
                for (int i = 1; i <= num; i++) {
                    if (i % 4 == 0 && i % 3 == 0) {
                        System.out.print(i + ",");
                        total += i;
                        sayac += 1;
                    }
                    if (i == num) {
                        System.out.println("\b");
                    }
                }
                System.out.println("Bölünebilen Sayıların Toplamı\t: " + total);
                System.out.println("Bölünebilen Sayı Miktarı\t\t: " + sayac);
                System.out.println("Bölünebilen Sayıların Ortalaması: " + total / sayac);
            } else if (num < 12 && num > 0) {
                System.out.println("Herhangi bir sayı bulunamadı...");
            } else {
                System.out.println("Lütfen Pozitif Tamsayı Giriniz...");
            }
        } else {
            System.out.println("Lütfen Pozitif Tamsayı Giriniz...");
        }
    }
}
