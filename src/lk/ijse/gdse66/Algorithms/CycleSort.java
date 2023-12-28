package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 9:06 PM - 12/28/2023
 **/
public class CycleSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        cycleSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void cycleSort(int[] array) {
        int n = array.length;

        for (int start = 0; start < n - 1; start++) {
            int element = array[start];
            int position = start;

            // Find the correct position for the current element
            for (int i = start + 1; i < n; i++) {
                if (array[i] < element) {
                    position++;
                }
            }

            // If the element is already in the correct position, skip
            if (position == start) {
                continue;
            }

            // Otherwise, cycle through to find the correct position
            while (element == array[position]) {
                position++;
            }

            // Swap the current element with the element at the correct position
            int temp = array[position];
            array[position] = element;
            element = temp;

            // Repeat until we reach the starting position
            while (position != start) {
                position = start;

                // Find the correct position for the current element
                for (int i = start + 1; i < n; i++) {
                    if (array[i] < element) {
                        position++;
                    }
                }

                // Cycle through to find the correct position
                while (element == array[position]) {
                    position++;
                }

                // Swap the current element with the element at the correct position
                temp = array[position];
                array[position] = element;
                element = temp;
            }
        }
    }
}