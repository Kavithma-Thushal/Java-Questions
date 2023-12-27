package lk.ijse.gdse66.Others;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 1:34 PM - 12/27/2023
 **/
public class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input base: ");
        int base = input.nextInt();

        System.out.print("Input power: ");
        int power = input.nextInt();

        int result = 1;

        for (int i = 0; i < power; i++) {
            result = result * base;
        }

        System.out.print("Result: " + result);
    }
}