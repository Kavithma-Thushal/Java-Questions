package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 1:10 PM - 12/27/2023
 **/
public class OwnNumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = scanner.nextInt();

        System.out.print("Enter second number : ");
        int second = scanner.nextInt();

        int max = (first < second) ? second : first;
        int min = (first < second) ? first : second;

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}