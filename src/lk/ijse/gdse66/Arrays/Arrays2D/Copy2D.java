package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 8:19 AM - 12/30/2023
 **/
public class Copy2D {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};
        int[][] newArr = new int[arr.length][arr[0].length];

        newArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.deepToString(newArr));
    }
}