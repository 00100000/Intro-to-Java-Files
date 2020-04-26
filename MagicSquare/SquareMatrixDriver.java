//
// SquareMatrixDriver.java     Author: Aidan Din
//
// User interactions with SquareMatrix.java
//

import javax.swing.JOptionPane;

public class SquareMatrixDriver {
    public static void main(String[] args) {
        SquareMatrix square = new SquareMatrix();
        String elementString;
        // I was recently working with discordjs bots, which use a lot of error handling
        // so...
        // error handling!
        try {
            do {
                // dimensions
                int n = Integer
                        .parseInt(JOptionPane.showInputDialog("Please enter the dimension dimension for your square."));
                // loop array inputs
                for (int i = 0; i < n; i++) {
                    String tempString = JOptionPane
                            .showInputDialog("Please enter the numbers for row " + i + ", separated by a space.");
                    elementString += " " + tempString;
                }
                int[] elements = elementString.trim().split(" ");
                int[] matrix = createArr(n, elements);
                // matrix
                JOptionPane.showInputDialog("Your matrix: " + twoDToString(matrix));
                // result
                String result = isMagic(matrix) ? "Your matrix is a magic square!"
                        : "Your matrix is not a magic square";
                JOptionPane.showMessageDialog(null, result);
                // user exit loop
            } while (JOptionPane.showConfirmDialog(null, "Would you like to re-run the program?", null,
                    JOptionPane.YES_NO_OPTION) == 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "There was an error in processing your request, please re-run the program");
            System.out.println(e);
        }
    }
}