package week3.day1;

import utils.ArrayUtils;
import utils.MatrixUtils;

/**
 * Created by skl1f on 4/23/2016.
 */
public class _05MultiArrays {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.genArray(15, 0, 25);
        int[] nums2 = ArrayUtils.genArray(15, 0, 25);

        int[][] matrix = {{0, 1, 2}, {3, 4}, {5, 6, 7}};
        int[][] matrix2 = new int[3][4];
        int[][] matrix3 = MatrixUtils.createAndFill(4, 4);
        MatrixUtils.toString(matrix3);
    }
}
