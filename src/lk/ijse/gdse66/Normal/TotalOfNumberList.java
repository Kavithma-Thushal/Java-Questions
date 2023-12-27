package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 1:14 PM - 12/27/2023
 **/
public class TotalOfNumberList {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();

        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }

        System.out.println(total);
    }
}