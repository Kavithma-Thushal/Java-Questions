package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:39 PM - 12/26/2023
 **/
class DigitCount {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        System.out.println(count);
    }
}