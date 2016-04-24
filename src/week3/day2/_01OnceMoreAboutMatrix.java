package week3.day2;

import utils.MatrixUtils;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by skl1f on 4/24/2016.
 * Playing with matrix
 */
public class _01OnceMoreAboutMatrix {
    public static void main(String[] args) {
        int[][] matrix2 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        int[][] matrix = new int[3][3];

        int[][] matrix3 = new int[3][];
        matrix3[0] = new int[3];
        matrix3[1] = new int[2];
        matrix3[2] = new int[3];


        MatrixUtils.toString(matrix3);
    }
}
