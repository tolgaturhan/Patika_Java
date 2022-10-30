import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = scan.nextInt();
        int count = 0;
        int i = 2;
        for (int h = 2; h <= n; h++) {
            while (i < h) {
                if (h % i == 0) {
                    count++;
                }
                i++;
            }
            i = 2;
            if (count == 0) {
                System.out.print(h + ", ");
            }
            count = 0;
        }
        System.out.println("\b\b");
    }
}