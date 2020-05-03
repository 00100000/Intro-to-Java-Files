public class SquareMatrix {
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
        int expectedSum = 0, tempSumColumn = 0, tempSumRow = 0, diagonalOne = 0, diagonalTwo = 0, check = 0, uniques = 0;
        // get expected sum
        for (int i = 0; i < matrix[0].length; i++) {
            expectedSum += matrix[0][i];
        }
        // check all rows
        for (int a = 0; a < matrix[0].length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                tempSumRow += matrix[a][b];
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
                tempSumColumn += matrix[d][c];
            }
            if (tempSumColumn != expectedSum) return false;
            tempSumColumn = 0;
        }
        // gotta make sure it contains digits (n to n^2)
        for (int e = 0; e < matrix[0].length; e++) {
            for (int f = 0; f < matrix[0].length; f++) {
                if (matrix[e][f] > Math.pow(n, 2) || matrix[e][f] < 1) return false;
            }
        }
        // checks all digits are unique (that 4 nested loop nightmare tho)
        for (int g = 0; g < matrix[0].length; g++) {
            for (int h = 0; h < matrix[0].length; h++) {
                check = matrix[g][h];
                for (int j = 0; j < matrix[0].length; j++) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (check == matrix[j][k]) uniques++;
                    }
                }
                if (uniques > 1) return false;
                uniques = 0;
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