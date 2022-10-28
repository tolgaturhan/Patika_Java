import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz: ");
        int number = scan.nextInt();
        int tempNumber = number;
        int basNumber = 0;
        int basValue;
        int basPow;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        System.out.println(result);
    }
}
