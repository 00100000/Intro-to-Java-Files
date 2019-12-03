/* Author: Aidan Din    CozaLozaWoza.java
*
* Prints either "Coza," "Loza," or "Woza," in place of a number depending on if it's divisible by 3, 5, or 7. 11 Numbers per line
*/

import javax.swing.JOptionPane;

public class CozaLozaWoza
{
    public static void main (String[] args)
    {
        String userInputString = JOptionPane.showInputDialog("Please input an integer.");
        int userInput = Integer.parseInt(userInputString);

        JOptionPane.showMessageDialog(null, cozaLozaWoza(userInput));
    }
    public static String cozaLozaWoza(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                return "Coza";
            } else if (i % 5 == 0) {
                return "Loza";
            } else if (i % 7 == 0) {
                return "Woza";
            }
        }
    }
}
