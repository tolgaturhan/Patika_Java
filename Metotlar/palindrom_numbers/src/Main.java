import java.util.Scanner;
public class Main {
    static boolean isPali (int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if ( number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a integer value: ");
        int n = scan.nextInt();
        if (isPali(n) == true){
            System.out.println(n + " is a Palindrom Number.");
        } else {
            System.out.println(n + " is not a Palindrom Number.");
        }

    }
}