//
// SquareMatrix.java     Author: Aidan Din
//
// Methods for interacting with matrix
//

public class SquareMatrix {
    public static int n;
    public static int[] elements;
    private static int[] matrix = () -> {
        // translates an Array to a 2d Array
        int[] tempMatrix = new int[n][n];
        int trueX = 0;
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                trueX++;
                temoMatrix[i][x] = elements[trueX];
            }
        }
        return tempMatrix;
    };

    static String twoDToString(int[] arr) {
        // translates a 2d Array to a String
        String ret = "";
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                ret += " " + matrix[i][x];
            }
            ret += "\n";
        }
        return ret.trim();
    }

    public void add(int i, int row, int column) {
        // "sets" a new value for any element in the matrix
        matrix[row][column] = i;
    }

    public boolean isMagic() {
        return true;
    }
}