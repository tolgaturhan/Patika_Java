import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0, total = 0;

        do {
            System.out.print("Lütfen Bir Sayı Giriniz: ");
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number % 2 == 0 && number > 0) {
                    total += number;
                } else if (number <= 0){
                    System.out.println("Lütfen Pozitif Tamsayı Giriniz...");
                }
            } else {
                System.out.println("Sadece Sayı Girebilirsiniz...");
            }
            scan.nextLine();
        } while (number%2 != 1);
        System.out.println("Çift ve 4'e Bölünebilen Sayıların Toplamı: " + total);
    }
}


