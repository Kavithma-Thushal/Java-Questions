package lk.ijse.gdse66.Arrays;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 3:14 PM - 12/28/2023
 **/
public class CopyElementValues {
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] brr = new int[arr.length];
        int[] crr = new int[arr.length - 5];
        int[] drr = new int[arr.length + 5];

        copyElementValues(arr, brr);
        copyElementValues(arr, crr);
        copyElementValues(arr, drr);

        System.out.println(Arrays.toString(arr));    // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        System.out.println(Arrays.toString(brr));    // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        System.out.println(Arrays.toString(crr));    // [10, 20, 30, 40, 50]
        System.out.println(Arrays.toString(drr));    // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 0, 0, 0, 0, 0]

    }

    public static void copyElementValues(int[] oldArr, int[] newArr) {
        for (int i = 0; i < ((oldArr.length > newArr.length) ? newArr.length : oldArr.length); i++) {
            newArr[i] = oldArr[i];
        }
    }
}