import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun;
        Scanner sayi = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        gun = sayi.nextInt();

        switch (gun) {
            case 1 -> System.out.println("Bugün Pazartesi");
            case 2 -> System.out.println("Bugün Salı");
            case 3 -> System.out.println("Bugün Çarşamba");
            case 4 -> System.out.println("Bugün Perşembe");
            case 5 -> System.out.println("Bugün Cuma");
            case 6 -> System.out.println("Bugün Cumartesi");
            case 7 -> System.out.println("Bugün Pazar");
            default -> System.out.println("1 ile 7 arasında bir sayı giriniz...");
        }
    }
}