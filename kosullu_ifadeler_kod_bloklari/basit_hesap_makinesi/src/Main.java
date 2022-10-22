import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner calc = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = calc.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = calc.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi Seçiniz: ");
        select = calc.nextInt();

        switch(select){
            case (1):
                System.out.println("Sonuç: " + (n1 + n2));
                break;
            case (2):
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case (3):
                System.out.println("Sonuç: " + (n1 * n2));
                break;
            case (4):
                if (n2 != 0){
                    System.out.println("Sonuç: " + (n1 / n2));
                } else {
                    System.out.println("Sayı sıfıra bölünemez...");
                }
                break;
            default:
                System.out.println("Lütfen bir işlemlerden birini seçiniz...");
        }

       /* if (select == 1) {
            int sonuc = n1 + n2;
            System.out.println("Sonuç: " + sonuc);
        } else if (select == 2) {
            int sonuc = n1 - n2;
            System.out.println("Sonuç: " + sonuc);
        } else if (select == 3) {
            int sonuc = n1 * n2;
            System.out.println("Sonuç: " + sonuc);
        } else if (select == 4) {
            if (n2 != 0) {
                int sonuc = n1 / n2;
                System.out.println("Sonuç: " + sonuc);
            } else {
                System.out.println("Sayı sıfıra bölünemez...");
            }

        } else {
            System.out.println("Lütfen işlemlerden birini seçiniz...");
        }*/
    }
}