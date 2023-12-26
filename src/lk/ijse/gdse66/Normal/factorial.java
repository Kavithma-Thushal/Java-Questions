package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 7:22 PM - 12/26/2023
 **/
public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();

        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        System.out.println(fac);
    }
}