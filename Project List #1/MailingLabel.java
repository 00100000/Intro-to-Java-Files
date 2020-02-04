/* Author: Aidan Din    MailingLabel.java
*
*  Takes a delimiter and a message from a user and coverts it into a mailing label
*/

import javax.swing.JOptionPane;

public class MailingLabel
{
  public static void main (String[] args)
  {
    int exitCondition = JOptionPane.NO_OPTION;
    //user controlled exit loop
    do {
      //gets user input
      String delimiter = JOptionPane.showInputDialog("Please enter a delimiter for your mailing address.");
      
      String finalMessage = JOptionPane.showInputDialog("Please enter your final message with delimiters to seperate different lines.");
      
      //prints final label
      System.out.println("----------------------------");
      System.out.println(mailingLabel(finalMessage, delimiter));
      System.out.println("----------------------------");
      
      exitCondition = JOptionPane.showConfirmDialog                                                          (null, "Do you want to rerun the program?");
      
    } while (exitCondition == 0);
    //user controlled exit loop
  }
  public static String mailingLabel(String str, String del) { //returns a string with the delimiters representing a new line
    String replace = str.replaceAll(del, System.lineSeparator());
    return replace;
  }
}
