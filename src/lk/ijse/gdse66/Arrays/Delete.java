package lk.ijse.gdse66.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:32 PM - 12/26/2023
 **/
public class Delete {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56};
        int[] newArr = new int[arr.length - 1];

        System.out.print("Enter a value to delete : ");
        int value = new Scanner(System.in).nextInt();

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                newArr[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}