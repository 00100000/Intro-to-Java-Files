/* Author: Aidan Din    MailingLabel.java
*
* Takes a delimeter and a message from a user and coverts it into a mailing label
*/

import javax.swing.JOptionPane;

public class MailingLabel
{
    public static void main (String[] args)
    {
        String delimeter = JOptionPane.showInputDialog("Please enter a delimeter for your mailing address.");

        String finalMessage = JOptionPane.showInputDialog("Please enter your final message with delimeters to seperate different lines.");

        System.out.println("----------------------------");
        System.out.println(mailingLabel(finalMessage, delimeter));
        System.out.println("----------------------------");
        }
    public static String mailingLabel(String str, String del) {
        String finalMessage = "";

        for (int index = str.length() - 1; index >= 0; index--) { //reverses a string
            char messageChar = str.charAt(index);
            finalMessage += messageChar;
        }
        return finalMessage;
    }
}
