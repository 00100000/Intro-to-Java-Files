/* Author: Aidan Din    CozaLozaWoza.java
*
* Prints either "Coza," "Loza," or "Woza," in place of a number depending on if it's divisible by 3, 5, or 7. 11 Numbers per line
*/

import javax.swing.JOptionPane;

public class CozaLozaWoza
{
    public static void main (String[] args)
    {
        String userInputString = JOptionPane.showInputDialog("Please input an integer."); //gets user input
        int userInput = Integer.parseInt(userInputString);

        JOptionPane.showMessageDialog(null, cozaLozaWoza(userInput)); //final output
    }
    public static String cozaLozaWoza(int n) { //replaces numbers divisible by 3, 5, and 7 with coza, loza, and woza respectively
        boolean divisible;
        String finalMessage = "";
        
        //loops to check the divisibility of numbers
        for (int i = 1; i <= n; i++) {
            divisible = true;

            if (i % 3 == 0) {
                finalMessage = finalMessage + "Coza ";
                divisible = false;
            }
            if (i % 5 == 0) {
                finalMessage = finalMessage + "Loza ";
                divisible = false;
            }
            if (i % 7 == 0) {
                finalMessage = finalMessage + "Woza ";
                divisible = false;
            }
            if (divisible == false) {
                finalMessage = finalMessage + i + " ";
            }
            if (i % 11 == 0) {
                return System.lineSeparator();
            }
        }
        //returns final message
        return finalMessage;
    }
}
