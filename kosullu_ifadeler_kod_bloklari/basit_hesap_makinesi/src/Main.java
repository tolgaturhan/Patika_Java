import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float n1, n2, select;
        Scanner calc = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = calc.nextFloat();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = calc.nextFloat();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi Seçiniz: ");
        select = calc.nextFloat();

        if (select == 1) {
            float sonuc = n1 + n2;
            System.out.println("Sonuç: " + sonuc);
        } else if (select == 2) {
            float sonuc = n1 - n2;
            System.out.println("Sonuç: " + sonuc);
        } else if (select == 3) {
            float sonuc = n1 * n2;
            System.out.println("Sonuç: " + sonuc);
        } else if (select == 4) {
            if (n2 != 0) {
                float sonuc = n1 / n2;
                System.out.println("Sonuç: " + sonuc);
            } else {
                System.out.println("Sayı 0(sıfır)'a bölünemez...!!!");
            }

        } else {
            System.out.println("Lütfen işlemlerden birini seçiniz...");
        }
    }
}