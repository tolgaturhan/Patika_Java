import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        int password;
        boolean askPassword = true;

        do {
            System.out.print("1Lütfen Şifrenizi Giriniz: ");
            password = pass.nextInt();
            if (password == 123) {
                System.out.println("1Şifre Doğru Sisteme Giriş Yapılıyor...");
                askPassword = false;
            } else {
                System.out.println("1Şifre yanlış tekrar deneyiniz...");
            }
        } while (askPassword);
    }
}
