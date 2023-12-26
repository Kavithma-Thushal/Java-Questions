package lk.ijse.gdse66.Arrays.BubbleSort;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:38 PM - 12/26/2023
 **/
class Complete {
    public static void main(String[] args) {
        int[] arr = {8, 9, 7, 1, 3, 2};

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

                System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));       // [1, 2, 3, 7, 8, 9]
    }
}