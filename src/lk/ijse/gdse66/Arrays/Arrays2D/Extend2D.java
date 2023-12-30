package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 11:52 AM - 12/30/2023
 **/
public class Extend2D {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};
        arr = extend(arr);
        System.out.println(Arrays.deepToString(arr));           // [[5, 3], [7, 2], [4, 8], [2, 5], [1, 7], [0, 0]]
    }

    public static int[][] extend(int[][] arr) {
        int[][] newArr = new int[arr.length + 1][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        return newArr;
    }
}