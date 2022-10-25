import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        boolean isPasswordCorrect = false;
        int password;
        Scanner pass = new Scanner(System.in);

        while(!isPasswordCorrect){
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            password = pass.nextInt();
            if(password == 123){
                System.out.println("Şifre doğru sisteme giriş yapılıyor...");
                isPasswordCorrect = true;
            } else {
                System.out.println("Hatalı şifre, tekrar deneyiniz...");
            }
        }
    }
}
