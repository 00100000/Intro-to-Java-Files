//
// SquareMatrixDriver.java     Author: Aidan Din
//
// User interactions with SquareMatrix.java
//

import javax.swing.JOptionPane;

public class SquareMatrixDriver {
    public static void main(String[] args) {
        int runStatus = 69420;
        do {
            try {
                // matrix dimensions
                int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of the matrix."));
                SquareMatrix square = new SquareMatrix(n);
                // matrix value input
                for (int i = 0; i < n; i++) {
                    // row 1 makes more "sense" than having a row 0, so...
                    String[] temp = JOptionPane.showInputDialog(null,
                            "Please enter row " + (i + 1) + " of your matrix, with each item separated by a space")
                            .trim().split(" ");
                    // add row to matrix
                    for (int x = 0; x < temp.length; x++) {
                        square.add(Integer.parseInt(temp[x]), i, x);
                    }
                }
                // displays 2d array to user
                JOptionPane.showMessageDialog(null, "You entered:\n" + square.pseudoDeepToString());
                // checks if matrix is a magic square with a very fancy ternary operator
                JOptionPane.showMessageDialog(null,
                        "Your matrix is" + (square.isMagic() ? " " : " not ") + "a magic square.");
                // too long to put on 1 line, user exit loop
                runStatus = JOptionPane.showConfirmDialog(null, "Would you like to re-run the program?",
                        "A wild pop-up box has appeared!", JOptionPane.YES_NO_OPTION);
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "There was an error in processing your request.");
            }
        } while (runStatus == 0);
    }
}