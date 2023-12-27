package lk.ijse.gdse66.NumberSystems;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 7:22 PM - 12/26/2023
 **/

/**
 * Factorial of 5 is : 1*2*3*4*5=120
 **/
public class Factorial {
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