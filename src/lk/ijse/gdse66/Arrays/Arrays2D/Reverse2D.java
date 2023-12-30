package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 9:20 AM - 12/30/2023
 **/
public class Reverse2D {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};
        int[][] newArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[arr.length - (i + 1)][arr[i].length + (j - 2)];
            }
        }

        System.out.println(Arrays.deepToString(newArr));        // [[1, 7], [2, 5], [4, 8], [7, 2], [5, 3]]
    }
}