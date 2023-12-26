package lk.ijse.gdse66.Normal;

import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 6:43 PM - 12/26/2023
 **/
public class Others {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ownNumberList();
        getTotalOfNumberList();
    }

    public static void ownNumberList() {

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

    public static void getTotalOfNumberList() {
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }

        System.out.println(total);
    }
}