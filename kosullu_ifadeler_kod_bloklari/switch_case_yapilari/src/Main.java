import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String gun;
        Scanner sayi = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        gun = sayi.nextLine();

        switch (gun) {
            case "1" -> System.out.println("Bugün Pazartesi");
            case "2" -> System.out.println("Bugün Salı");
            case "3" -> System.out.println("Bugün Çarşamba");
            case "4" -> System.out.println("Bugün Perşembe");
            case "5" -> System.out.println("Bugün Cuma");
            case "6" -> System.out.println("Bugün Cumartesi");
            case "7" -> System.out.println("Bugün Pazar");
            default -> System.out.println("1 ile 7 arasında bir tam sayı giriniz...");
        }
        System.out.println("test");
        if (gun.equals("2")){
            System.out.println("Bugün film izleyebilirsiniz...");
        }
        else{
            System.out.println("film izleyemezsiniz");
        }

        String name = "Ali",surname = "Vara";

        String compare = (name.equals(surname)) ? "true": "false";
        System.out.println(compare);

    }
}