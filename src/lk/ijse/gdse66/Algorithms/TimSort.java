package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 8:47 PM - 12/28/2023
 **/
public class TimSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        timSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void timSort(int[] array) {
        int n = array.length;

        // Set the size of a run (a small sorted block)
        int minRun = 32;

        // Divide the array into runs and sort each run using insertion sort
        for (int i = 0; i < n; i += minRun) {
            insertionSort(array, i, Math.min((i + minRun - 1), n - 1));
        }

        // Merge runs to build the final sorted array
        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                // Merge the two halves
                merge(array, left, mid, right);
            }
        }
    }

    public static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < len2; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < len2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}