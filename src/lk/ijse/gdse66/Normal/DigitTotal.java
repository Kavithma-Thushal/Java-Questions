package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 1:16 PM - 12/27/2023
 **/
public class DigitTotal {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();

        int total = 0;
        while (num != 0) {
            total += num % 10;
            num /= 10;
        }
        System.out.println(total);
    }
}