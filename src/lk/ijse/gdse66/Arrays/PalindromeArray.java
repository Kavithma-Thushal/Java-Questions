package lk.ijse.gdse66.Arrays;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 10:14 AM - 12/28/2023
 **/
public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - (i + 1)] = arr[i];
        }

        System.out.println(Arrays.toString(temp));

        if (Arrays.equals(arr, temp)) {
            System.out.println("This is a Palindrome Array");
        } else {
            System.out.println("This is not a Palindrome Array");
        }
    }
}