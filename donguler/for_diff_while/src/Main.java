import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        /*
        for(boolean run = true; run;){
            System.out.print("Bir Sayı Giriniz: ");
            num = scan.nextInt();
            if (num < 0){
                run = false;
            }
        }
        */

        /*
        System.out.print("Bir Sayı Giriniz: ");
        num = scan.nextInt();
        while(num > 0){
            System.out.print("Bir Sayı Giriniz: ");
            num = scan.nextInt();
        }
        */

        do{
            System.out.print("Bir Sayı Giriniz: ");
            num = scan.nextInt();
        } while (num > 0);

    }
}
