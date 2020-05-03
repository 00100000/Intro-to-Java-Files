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

class SquareMatrix {
    private int[][] matrix;
    private int n;

    public SquareMatrix(int dimensions) {
        n = dimensions;
        matrix = new int[n][n];
    }

    public void add(int i, int row, int column) {
        // adds an element to any part of the matrix
        matrix[row][column] = i;
    }

    public boolean isMagic() {
        // checks if it's a magic square or not
        int expectedSum = 0, tempSumColumn = 0, tempSumRow = 0, diagonalOne = 0, diagonalTwo = 0;
        // get expected sum
        for (int i = 0; i < matrix[0].length; i++) {
            expectedSum += matrix[0][i];
        }
        // check all rows
        for (int a = 0; a < matrix[0].length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                tempSumRow = matrix[a][b];
            }
            if (tempSumRow != expectedSum) return false;
            tempSumRow = 0;
        }
        // check diagonals
        for (int e = 0; e < n; e++) diagonalOne += matrix[e][e];
        for (int f = 0; f < n; f++) diagonalTwo += matrix[f][n - (f + 1)];
        if (diagonalOne != expectedSum || diagonalTwo != expectedSum) return false;
        // check all columns
        for (int c = 0; c < matrix[0].length; c++) {
            for (int d = 0; d < matrix[0].length; d++) {
                tempSumColumn = matrix[d][c];
            }
            if (tempSumColumn != expectedSum) return false;
            tempSumColumn = 0;
        }
        // gotta make sure it contains digits (n to n^2)
        for (int e = 0; e < matrix[0].length; e++) {
            for (int f = 0; f < matrix[0].length; f++) {
                if (matrix[e][f] > Math.pow(n, 2) || n < 1) return false;
            }
        }
        return true;
    }

    public String pseudoDeepToString() {
        // does what deepToString does, returns a 2d array as a String
        String ret = "";
        for (int i = 0; i < matrix[0].length; i++) {
            for (int x = 0; x < matrix[0].length; x++) {
                ret += " " + matrix[i][x];
            }
            ret += "\n";
        }
        return ret;
    }
}