/* Author: Aidan Din    Palindrome.java
*
* Reverses a string and returns if it's a palindrome or not
*/
import java.util.Scanner;

public class Palindrome 
{
    public static void main (String[] args)
    {
        int againOrExit = 1;
        while (againOrExit == 1) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter any word or sentence and we'll tell you if it's a palindrome or not!");
            String userInput = scan.nextLine();

            System.out.println("Your word/sentence backwards is " + reverseString(userInput));
            boolean palindrome = isPalindrome(userInput);
            
            if (palindrome = true) {
                System.out.println("Your word/sentence is a palindrome!");
            } else {
                System.out.println("Your word/sentence is NOT a palindrome!");
            }

            System.out.println("Type 1 to re-run the program. Type 2 to exit the program.");
            againOrExit = scan.nextInt();

            if (againOrExit == 2) {
                System.out.println("Thank you for using my program <3");
            }
            scan.close();
        }
    }
    public static String reverseString(String str) {
        String finalMessage = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            char messageChar = str.charAt(index);
            finalMessage += messageChar;
        }
        return finalMessage;
    }
    public static boolean isPalindrome(String str) {
        String callReverseString = reverseString(str);

        if (callReverseString.equalsIgnoreCase("str")) {
            return true;
        } else {
            return false;
        }
    }
}
