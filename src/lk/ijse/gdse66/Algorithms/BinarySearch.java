package lk.ijse.gdse66.Algorithms;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 9:53 PM - 12/28/2023
 **/

/**
 * This algorithm is much more efficient than LinearSearch for large datasets
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Target found
            } else if (array[mid] < target) {
                low = mid + 1; // Target may be in the right half
            } else {
                high = mid - 1; // Target may be in the left half
            }
        }

        return -1; // Target not found
    }
}