package lk.ijse.gdse66.Algorithms;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 9:03 PM - 12/28/2023
 **/
public class PigeonholeSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 7, 1, 3, 2};
        System.out.println("Original Array : " + Arrays.toString(array));

        pigeonholeSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void pigeonholeSort(int[] array) {
        int min = Arrays.stream(array).min().orElse(0);
        int max = Arrays.stream(array).max().orElse(0);
        int range = max - min + 1;

        // Create pigeonholes
        int[] pigeonholes = new int[range];
        Arrays.fill(pigeonholes, 0);

        // Distribute elements into pigeonholes
        for (int value : array) {
            pigeonholes[value - min]++;
        }

        // Copy elements back to the original array
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (pigeonholes[i]-- > 0) {
                array[index++] = i + min;
            }
        }
    }
}