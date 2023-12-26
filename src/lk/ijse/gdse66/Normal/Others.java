package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 6:43 PM - 12/26/2023
 **/
public class Others {
    public static void main(String[] args) {
        ownNumberList();
    }

    public static void ownNumberList() {
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