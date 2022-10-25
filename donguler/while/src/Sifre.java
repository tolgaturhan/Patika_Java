import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        boolean isPasswordFalse = true;
        int password;
        Scanner pass = new Scanner(System.in);

        while(isPasswordFalse){
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            password = pass.nextInt();
            if(password == 123){
                System.out.println("Şifre doğru sisteme giriş yapılıyor...");
                isPasswordFalse = false;
            } else {
                System.out.println("Hatalı şifre, tekrar deneyiniz...");
            }
        }
    }
}
