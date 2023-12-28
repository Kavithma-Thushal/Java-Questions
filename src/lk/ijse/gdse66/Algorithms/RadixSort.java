package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 8:41 PM - 12/28/2023
 **/
public class RadixSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        radixSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void radixSort(int[] array) {
        // Find the maximum number to know the number of digits
        int max = Arrays.stream(array).max().orElse(0);

        // Do counting sort for every digit, starting from the least significant to the most significant
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    public static void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Initialize count array
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int value : array) {
            count[(value / exp) % 10]++;
        }

        // Change count[i] so that count[i] contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        // Copy the output array to the original array
        System.arraycopy(output, 0, array, 0, n);
    }
}