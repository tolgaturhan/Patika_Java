import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yr = new Scanner(System.in);
        int year, leap;

        System.out.print("Enter The Year Want To Calculate: ");
        if (yr.hasNextInt()) {
            year = yr.nextInt();
            leap = year % 4;
            if (leap == 0) {
                if (year < 0) {
                    System.out.println("Cannot Enter a Negative Value...");
                } else {
                    System.out.println(year + " is a Leap Year...");
                }
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Please enter an Integer Value...");
        }
    }
}
