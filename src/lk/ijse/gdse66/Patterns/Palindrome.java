package lk.ijse.gdse66.Patterns;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 1:41 PM - 12/27/2023
 **/

import java.util.Scanner;

/**
 * Remains the same when its digits are Reversed!
 * 121, 1331, 1221, 12321, 454, 12321, 1001, 12211221 (OK)
 * 123, 456, 101, 9876, 12345, 876543, 1002, 54321 (Error)
 **/
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();
        int temp = num;

        int newValue = 0;
        while (num != 0) {
            int remain = num % 10;
            newValue = (newValue * 10) + remain;
            num /= 10;
        }

        if (temp == newValue) {
            System.out.println("This is a Palindrome Number");
        } else {
            System.out.println("This is not a Palindrome Number");
        }
    }
}