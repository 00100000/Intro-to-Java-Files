/* Author: Aidan Din    CozaLozaWoza.java
*
* Prints either "Coza," "Loza," or "Woza," in place of a number depending on if it's divisible by 3, 5, or 7. 11 Numbers per line
*/

import javax.swing.JOptionPane;

public class CozaLozaWoza
{
  public static void main (String[] args)
  {
    int exitCondition = JOptionPane.NO_OPTION;
    //user controlled exit loop
    do {
      String userInputString = JOptionPane.showInputDialog("Please input an integer."); //gets user input
      int userInput = Integer.parseInt(userInputString);

      JOptionPane.showMessageDialog(null, cozaLozaWoza(userInput)); //final output
      JOptionPane.showConfirmDialog(null, "Do you want to rerun the program?");
      
    } while (exitCondition == 0);
      //user controlled exit loop
  }
  public static String cozaLozaWoza(int n) { //replaces numbers divisible by 3, 5, and 7 with coza, loza, and woza respectively
    String x = "";
        
    //loops to check the divisibility of numbers
    for (int i = 1; i <= n; i++) {
      boolean divisible = false;

      if (i % 3 == 0) {
        x += "Coza";
        divisible = true;
      }
      if (i % 5 == 0) {
        x += "Loza";
        divisible = true;
      }
      if (i % 7 == 0) {
        x += "Woza";
        divisible = true;
      }
      if (divisible == false) {
        x += i;
      }
      if (i % 11 == 0) {
        x += "\n";
      } else {
        x += " ";
      }
    }
    //returns the final String
    return x;
  }
}
