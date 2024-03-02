import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        printTranspose(matrix);
    }

    static void printTranspose(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                transpose[column][row] = matrix[row][column];
            }
        }
        System.out.println(Arrays.deepToString(transpose));
    }
}
