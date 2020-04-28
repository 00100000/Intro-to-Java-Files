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
        // I was recently working with discord.js bots, which use a lot of error handling
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
                int[] elements = () -> {
                    String[] elementStringArray = elementString.trim().split(" ");
                    int[] intStringArray = new int[elementStringArray.length];
                    for (int x = 0; x < elementStringArray.length; x++) {
                        intStringArray[x] = Integer.parseInt(elementStringArray[i]);
                    };
                };
                int[] matrix = square.createArr(n, elements);
                // matrix
                JOptionPane.showInputDialog("Your matrix: " + square.twoDToString(matrix));
                // result
                JOptionPane.showMessageDialog(null, "Your matrix is" + (square.isMagic(matrix)?" not ":" ") + "a magic square!");
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