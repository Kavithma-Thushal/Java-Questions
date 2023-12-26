package lk.ijse.gdse66.Arrays;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:42 PM - 12/26/2023
 **/
public class DigitToArray {
    public static void main(String[] args) {
        int num = 34678;
        int[] arr = new int[count(num)];

        for (int i = 0; i < arr.length; i++) {
            int save = num % 10;
            num /= 10;
            arr[arr.length - (i + 1)] = save;
        }

        System.out.println(Arrays.toString(arr));       // [3, 4, 6, 7, 8]
    }

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}