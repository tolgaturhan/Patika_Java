import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, nPassword, nPass;
        Scanner login = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName = login.nextLine();

        System.out.print("Şifre: ");
        password = login.nextLine();

        if (userName.equals("patika")) {
            if (password.equals("Java101")) {
                System.out.println("Sisteme giriş yapıldı, sayfaya yönlendiriliyorsunuz...");
            } else {
                System.out.print("Şifreniz yanlış, yeni şifre belirlemek için 1'i tıklayınız: ");
                nPass = login.nextLine();
                if (nPass.equals("1")) {
                    System.out.print("Yeni Şifreniz: ");
                    nPassword = login.nextLine();
                    if (nPassword.equals("Java101") || (nPassword.equals(password))) {
                        System.out.println("Daha önce kullandığınız bir şifre kullanamazsınız...");
                    } else {
                        System.out.println("Yeni Şifreniz Başarıyla oluşturulmuştur...");
                    }
                } else {
                    System.out.println("Lütfen daha sonra tekrar deneyiniz...");
                }
            }
        } else {
            System.out.println("Kullanıcı adı yanlış...");
        }
    }
}
