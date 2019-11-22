/* Author: Aidan Din    Palindrome.java
*
* Reverses a string and returns if it's a palindrome or not
*/
import java.util.Scanner; //imports the scanner utility

public class Main
{
    public static void main (String[] args) //main method
    {
        int againOrExit = 1;
        do { //user controlled exit loop
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter any word and we'll tell you if it's a palindrome or not!");
            String userInput = scan.nextLine();

            System.out.println("Your word backwards is: " + reverseString(userInput));
            boolean palindrome = isPalindrome(userInput);
            
            if (palindrome == true) { //outputs if a word is a palindrome or not
                System.out.println("Your word is a palindrome!");
            } else {
                System.out.println("Your word is NOT a palindrome!");
            }

            System.out.println("Type 1 to re-run the program. Type 2 to exit the program.");
            againOrExit = scan.nextInt();
        } while (againOrExit == 1); //user controlled exit loop
        
        if (againOrExit == 2) {
            System.out.println("Thank you for using my program <3");
        }
    }
    public static String reverseString(String str) { //returns a reversed string
        String finalMessage = "";

        for (int index = str.length() - 1; index >= 0; index--) { //reverses a string
            char messageChar = str.charAt(index);
            finalMessage += messageChar;
        }
        return finalMessage;
    }
    public static boolean isPalindrome(String str) { //checks if a string is equal to itself backwards
        String finalMessage = "";

        for (int index = str.length() - 1; index >= 0; index--) { //reverses a string
            char messageChar = str.charAt(index);
            finalMessage += messageChar;
        }

        if (finalMessage.equalsIgnoreCase(str)) { //checks string against itself
            return true;
        } else {
            return false;
        }
    }
}
