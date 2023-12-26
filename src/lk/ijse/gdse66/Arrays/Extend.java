package lk.ijse.gdse66.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:31 PM - 12/26/2023
 **/
public class Extend {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56};
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.print("Enter a number : ");
        int newValue = new Scanner(System.in).nextInt();
        newArr[arr.length] = newValue;

        System.out.println(Arrays.toString(newArr));    // [12, 23, 34, 45, 56, newValue]
    }
}