//
// SquareMatrix.java     Author: Aidan Din
//
// Methods for interacting with matrix
//

public class SquareMatrix {
    public int[] createArr(int n, int[] elements) {
        // translates an Array to a 2d Array
        int[] matrix = new int[n][n];
        int trueX = 0;
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                trueX++;
                matrix[i][x] = elements[trueX];
            }
        }
        return matrix;
    }

    static String twoDToString(int[] arr) {
        // translates a 2d Array to a String
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                trueX++;
                matrix[i][x] = elements[trueX];
            }
        }
    }

    public int get(int row, int column) {
        // gets any element of the matrix
    }

    public void add(int newValue, int row, int column) {
        // "sets" a new value for any element in the matrix
    }

    public boolean isMagic(int[] matrix) {

    }
}