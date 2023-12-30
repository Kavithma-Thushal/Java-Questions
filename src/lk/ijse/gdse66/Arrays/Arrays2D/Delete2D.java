package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 12:01 PM - 12/30/2023
 **/
public class Delete2D {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};

        System.out.print("Enter a number : ");          // Input = 7
        int num = new Scanner(System.in).nextInt();

        arr = delete(num, arr);
        System.out.println(Arrays.deepToString(arr));       // output = [[5, 3], [4, 8], [2, 5], [1, 7]]
    }

    public static int[][] delete(int num, int[][] arr) {
        int[][] newArr = new int[arr.length - 1][arr[0].length];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i][0]) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}