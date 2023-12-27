package lk.ijse.gdse66.Patterns;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 4:39 PM - 12/27/2023
 **/

import java.util.Scanner;

/**
 * Each digit raised to the power of total digits in that number
 * 153 =1^3 +5^3 +3^3
 **/
public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();

        int temp = num;
        int temp2 = num;
        int count = 0;
        int result = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        while (temp2 != 0) {
            int remain = temp2 % 10;
            int tot = 1;
            for (int i = 0; i < count; i++) {
                tot *= remain;
            }
            result += tot;
            temp2 /= 10;
        }

        if (num == result) {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }
    }
}