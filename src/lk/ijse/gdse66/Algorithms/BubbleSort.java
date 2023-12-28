package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 3:58 PM - 12/28/2023
 **/

/**
 * The Bubble Sort Algorithm is not very efficient for large datasets due to its higher time complexity.
 * Merge Sort or Quick Sort are highly efficient and are commonly used for larger datasets. Bubble Sort
 * is mainly used for educational purposes to understand basic sorting algorithms
 **/
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {8, 9, 7, 1, 3, 2};

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}