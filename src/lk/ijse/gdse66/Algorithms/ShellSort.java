package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 8:34 PM - 12/28/2023
 **/
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        shellSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void shellSort(int[] array) {
        int n = array.length;

        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for elements at the current gap
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                // Shift elements that are greater than temp to the right
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Place temp (the original array[i]) into its correct position
                array[j] = temp;
            }
        }
    }
}