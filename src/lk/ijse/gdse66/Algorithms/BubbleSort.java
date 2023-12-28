package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 3:58 PM - 12/28/2023
 **/

/**
 * The Bubble Sort Algorithm is not very efficient for large datasets due to its higher time complexity.
 * It is mainly used for educational purposes to understand basic sorting algorithms.
 * Merge Sort or Quick Sort are highly efficient and are commonly used for larger datasets.
 **/

// 1.) Check first two elements which greater than next element
// 2.) Create variable temp in int
// 3.) Then swap
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Sorted Array : " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
            System.out.println();
        }
    }
}