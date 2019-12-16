/* Author: Aidan Din    Palindrome.java
*
*  Reverses a string and returns if it's a palindrome or not
*/

import javax.swing.JOptionPane;

public class Palindrome
{
  public static void main (String[] args)
  {
    int exitCondition = JOptionPane.NO_OPTION;
    //user controlled exit loop
    do {
      String userInput = JOptionPane.showInputDialog("Please enter any word and we'll tell you if it's a palindrome or not!");
      
      String reversedString = "Your word backwards is: " + reverseString(userInput);
      boolean palindrome = isPalindrome(userInput);
      
      if (palindrome == true) { //outputs if a word is a palindrome or not
        JOptionPane.showMessageDialog(null, reversedString + ". Your word is a palindrome!");
      } else {
        JOptionPane.showMessageDialog(null, reversedString + ". Your word is NOT a palindrome!");
      }
      
      exitCondition = JOptionPane.showConfirmDialog(null, "Do you want to rerun the program?");
      
    } while (exitCondition == 0);
    //user controlled exit loop
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
