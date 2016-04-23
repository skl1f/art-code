package utils;

/**
 * Created by skl1f on 4/23/2016.
 */
public class MatrixUtils {
    public static int[][] createAndFill (int rows, int cols){
        int[][] matrix = new int[rows][cols];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public static void toString(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%-2d ", matrix[i][j]));
            }
            System.out.println();
        }
    }
}
