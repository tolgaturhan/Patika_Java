import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int yr, cz;

        System.out.print("Please Enter Your Birth Year: ");
        if (year.hasNextInt()) {
            yr = year.nextInt();
            cz = yr % 12;
            if (cz == 0) {
                System.out.println("Your Chinese Zodiac: Monkey");
            }
            if (cz == 1) {
                System.out.println("Your Chinese Zodiac: Rooster");
            }
            if (cz == 2) {
                System.out.println("Your Chinese Zodiac: Dog");
            }
            if (cz == 3) {
                System.out.println("Your Chinese Zodiac: Pig");
            }
            if (cz == 4) {
                System.out.println("Your Chinese Zodiac: Rat");
            }
            if (cz == 5) {
                System.out.println("Your Chinese Zodiac: Ox");
            }
            if (cz == 6) {
                System.out.println("Your Chinese Zodiac: Tiger");
            }
            if (cz == 7) {
                System.out.println("Your Chinese Zodiac: Rabbit");
            }
            if (cz == 8) {
                System.out.println("Your Chinese Zodiac: Dragon");
            }
            if (cz == 9) {
                System.out.println("Your Chinese Zodiac: Snake");
            }
            if (cz == 10) {
                System.out.println("Your Chinese Zodiac: Horse");
            }
            if (cz == 11) {
                System.out.println("Your Chinese Zodiac: Goat");
            }
            if (cz < 0) {
                System.out.println("Cannot Enter a Negative Value...");
            }
        } else {
            System.out.println("Wrong Entry, Please Enter Integer...");
        }
    }
}
