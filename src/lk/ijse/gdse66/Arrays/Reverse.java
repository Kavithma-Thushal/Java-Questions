package lk.ijse.gdse66.Arrays;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:30 PM - 12/26/2023
 **/
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - (i + 1)];
        }

        System.out.println(Arrays.toString(newArr));    // [56, 45, 34, 23, 12]
    }
}