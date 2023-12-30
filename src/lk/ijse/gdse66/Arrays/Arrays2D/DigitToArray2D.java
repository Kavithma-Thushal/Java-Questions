package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 3:18 PM - 12/30/2023
 **/
public class DigitToArray2D {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");          // Input = 569880
        int num = new Scanner(System.in).nextInt();

        int[][] arr = new int[getDigitCount(num)][2];
        addToArray(num, arr);
        System.out.println(Arrays.deepToString(arr));       // Output = [[5, 0], [6, 0], [9, 0], [8, 0], [8, 0], [0, 0]]
    }

    public static void addToArray(int num, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - (i + 1)][0] = num % 10;
            num /= 10;
        }
    }

    public static int getDigitCount(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}