import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, four, five;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if (number > 3) {
                for (four = 1; four <= number; four = four * 4) {
                    System.out.print(four + ", ");
                }
                System.out.println("\b\b");
            }
            if (number > 4) {
                for (five = 1; five <= number; five = five * 5) {
                    System.out.print(five + ", ");
                }
                System.out.println("\b\b");
            } else {
                System.out.println("Lütfen 3'ten Büyük Pozitif Tamsayı Giriniz...");
            }
        } else {
            System.out.println("Sadece Sayı Girişi Yapılabilir...");
        }
    }
}