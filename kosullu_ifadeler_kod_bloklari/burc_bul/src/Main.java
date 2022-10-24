import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner burc = new Scanner(System.in);
        System.out.print("Doğduğunuz Gün (1-31): ");

        if (burc.hasNextInt()) {
            day = burc.nextInt();
            System.out.print("Doğduğunuz Ay (1-12): ");

            if (burc.hasNextInt()) {
                month = burc.nextInt();

                if (month == 1 && day > 0 && day < 22) {
                    System.out.println("Burcunuz : Oğlak");
                }
                if (month == 1 && day > 21 && day < 32) {
                    System.out.println("Burcunuz : Kova");
                }
                if (month == 2 && day > 0 && day < 20) {
                    System.out.println("Burcunuz : Kova");
                }
                if (month == 2 && day > 19 && day < 30) {
                    System.out.println("Burcunuz : Balık");
                }
                if (month == 3 && day > 0 && day < 21) {
                    System.out.println("Burcunuz : Balık");
                }
                if (month == 3 && day > 20 && day < 32) {
                    System.out.println("Burcunuz : Koç");
                }
                if (month == 4 && day > 0 && day < 21) {
                    System.out.println("Burcunuz : Koç");
                }
                if (month == 4 && day > 20 && day < 31) {
                    System.out.println("Burcunuz : Boğa");
                }
                if (month == 5 && day > 0 && day < 22) {
                    System.out.println("Burcunuz : Boğa");
                }
                if (month == 5 && day > 21 && day < 32) {
                    System.out.println("Burcunuz : İkizler");
                }
                if (month == 6 && day > 0 && day < 23) {
                    System.out.println("Burcunuz : İkizler");
                }
                if (month == 6 && day > 22 && day < 31) {
                    System.out.println("Burcunuz : Yengeç");
                }
                if (month == 7 && day > 0 && day < 23) {
                    System.out.println("Burcunuz : Yengeç");
                }
                if (month == 7 && day > 22 && day < 32) {
                    System.out.println("Burcunuz : Aslan");
                }
                if (month == 8 && day > 0 && day < 23) {
                    System.out.println("Burcunuz : Aslan");
                }
                if (month == 8 && day > 22 && day < 32) {
                    System.out.println("Burcunuz : Başak");
                }
                if (month == 9 && day > 0 && day < 23) {
                    System.out.println("Burcunuz : Başak");
                }
                if (month == 9 && day > 22 && day < 31) {
                    System.out.println("Burcunuz : Terazi");
                }
                if (month == 10 && day > 0 && day < 23) {
                    System.out.println("Burcunuz : Terazi");
                }
                if (month == 10 && day > 22 && day < 32) {
                    System.out.println("Burcunuz : Akrep");
                }
                if (month == 11 && day > 0 && day < 22) {
                    System.out.println("Burcunuz : Akrep");
                }
                if (month == 11 && day > 21 && day < 31) {
                    System.out.println("Burcunuz : Yay");
                }
                if (month == 12 && day > 0 && day < 22) {
                    System.out.println("Burcunuz : Yay");
                }
                if (month == 12 && day > 21 && day < 32) {
                    System.out.println("Burcunuz : Oğlak");
                }
                if (month > 12 || month < 1 || day > 31 || day < 1){
                    System.out.println("Hatalı Tarih, Formata Uygun Giriş Yapınız...!!!");
                }
                if (month == 2 && (day == 30)){
                    System.out.println("Hatalı Tarih, Formata Uygun Giriş Yapınız...!!!");
                }
                if ((month == 2 || month == 4 || month == 6 || month == 9|| month == 11) && day == 31){
                    System.out.println("Hatalı Tarih, Formata Uygun Giriş Yapınız...!!!");
                }
            } else {
                System.out.println("Hatalı Tarih, Formata Uygun Giriş Yapınız...!!!");
            }
        } else {
            System.out.println("Hatalı Tarih, Formata Uygun Giriş Yapınız...!!!");
        }
    }
}
