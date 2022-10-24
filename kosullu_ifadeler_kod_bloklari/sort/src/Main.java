import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sort = new Scanner(System.in);
        int a, b, c;

        System.out.print("Birinci Sayıyı Giriniz: ");
        a = sort.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        b = sort.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz: ");
        c = sort.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(a + "\n" + b + "\n" + c);
            } else {
                System.out.println(a + "\n" + c + "\n" + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println(b + "\n" + a + "\n" + c);
            } else {
                System.out.println(b + "\n" + c + "\n" + a);
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println(c + "\n" + a + "\n" + b);
            } else {
                System.out.println(c + "\n" + b + "\n" + a);
            }
        }
    }
}