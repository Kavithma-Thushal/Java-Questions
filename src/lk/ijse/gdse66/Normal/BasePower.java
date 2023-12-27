package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 4:04 PM - 12/27/2023
 **/
public class BasePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Base Number : ");
        int base = scanner.nextInt();

        System.out.print("Enter Power Number : ");
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}