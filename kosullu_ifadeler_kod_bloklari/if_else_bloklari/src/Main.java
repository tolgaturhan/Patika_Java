import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int saltRatio;
        Scanner tuz = new Scanner(System.in);

        System.out.print("Lütfen tuz miktarını giriniz: ");
        saltRatio = tuz.nextInt();

        if (saltRatio >= 80)
            System.out.println("Yüksek Tuzlu...");

        else if (saltRatio >= 50)
            System.out.println("Orta Tuzlu...");

        else
            System.out.println("Normal Tuzlu...");
    }
}
