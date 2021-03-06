package Array;

import java.util.Arrays;

/**
 * Created by daniel on 5/18/17.
 */
public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 6}, // 3 // 0
                {1, 2, 3}, // 3 // 1
                {4, 6, 7}, // 3 // 2
                {34, 6, 9} // 3 // 3
        };

        System.out.println(matrix.length);
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(matrix[1][2]);
        System.out.println(matrix[3][0]);
        System.out.println(matrix[0][2]);

        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(matrix[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : matrix) { // parts -> whole
            for (int number : row) {
                System.out.println(number + " ");
            }
            System.out.println();
        }
    }

}
