import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int number = scan.nextInt();
        int tempNumber = number;
        int digitNumber = 0;
        int digitValue;
        int digitPow;
        int result = 0;
        int cycle = -1;
        System.out.print("Armstrong Numbers (0 - " + number + "): ");

        for (int t = 1; t <=number; t++) {
            cycle = cycle + 1;
            while (tempNumber != 0) {
                tempNumber /= 10;
                digitNumber++;
            }

            tempNumber = number - cycle;
            while (tempNumber != 0) {
                digitValue = tempNumber % 10;
                digitPow = 1;
                for (int i = 1; i <= digitNumber; i++) {
                    digitPow *= digitValue;
                }
                result += digitPow;
                tempNumber /= 10;
            }
            tempNumber = number - cycle;
            if (result == tempNumber){
                System.out.print(result + ", ");
            }
            result = 0;
            digitNumber = 0;
        }
        System.out.println("\b\b");
    }
}