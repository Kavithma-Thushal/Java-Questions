package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 8:38 PM - 12/28/2023
 **/
public class CountingSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        countingSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void countingSort(int[] array) {
        int n = array.length;

        // Find the maximum value in the array
        int max = Arrays.stream(array).max().orElse(0);

        // Create an array to store counts of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element
        for (int value : array) {
            count[value]++;
        }

        // Update the count array to represent the position of each element in the sorted array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create a temporary array to store the sorted result
        int[] result = new int[n];

        // Build the sorted array
        for (int i = n - 1; i >= 0; i--) {
            result[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(result, 0, array, 0, n);
    }
}