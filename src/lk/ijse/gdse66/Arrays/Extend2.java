package lk.ijse.gdse66.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 5:36 PM - 12/26/2023
 **/
public class Extend2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[1];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = scanner.nextInt();

            System.out.print("Do you want to continue? (y/n) : ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                arr = extendArr(arr);
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] extendArr(int[] arr) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return arr;
    }
}