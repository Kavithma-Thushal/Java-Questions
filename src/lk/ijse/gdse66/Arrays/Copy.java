package lk.ijse.gdse66.Arrays;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:26 PM - 12/26/2023
 **/

/**
 * There are 2 types of arrays in Java
 * 1.) Dimensional Array                    : int[] arr = new int[5];
 * 2.) Array Literal or Initialization List : int[] newArr = {12, 23, 34, 45, 56};
 */
public class Copy {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        //newArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr));    // [12, 23, 34, 45, 56]
    }
}