package lk.ijse.gdse66.Algorithms.Searching;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 9:59 PM - 12/28/2023
 **/
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found in the array
    }
}
