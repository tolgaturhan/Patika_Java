import java.util.Scanner;
/*
A palindrome is a word, number, phrase, or other sequence of symbols that
reads the same backwards as forwards, such as the words madam or racecar,
the date/time stamps 11/11/11 11:11 and 02/02/2020,
and the sentence: "A man a plan a canal Panama".

https://en.wikipedia.org/wiki/Palindrome
*/

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