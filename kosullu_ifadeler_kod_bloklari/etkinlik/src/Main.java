import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Hava Sıcaklığını Giriniz: ");
        heat = scan.nextInt();

        boolean case1 = heat < 5;
        boolean case2 = heat >= 5 && heat < 10;
        boolean case3 = heat >= 10 && heat < 15;
        boolean case4 = heat >= 15 && heat < 25;

        if (case1) {
            System.out.println("Kayak yapabilirsiniz...");
        } else if (case2) {
            System.out.println("Sinemaya gidebilirsiniz...");
        } else if (case3) {
            System.out.println("Sinemaya yada pikniğe gidebilirsiniz...");
        } else if (case4) {
            System.out.println("Pikniğe gidebilirsiniz...");
        } else {
            System.out.println("Yüzemeye gidebilirsiniz...");
        }
    }
}
