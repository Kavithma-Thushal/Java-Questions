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

        System.out.print("Input a number: ");
        int num = input.nextInt();

        int temp = num;
        int temp2 = num;
        int count = 0;
        int result = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        while (temp2 != 0) {
            int remain = temp2 % 10;    //1
            int t = 1;
            for (int i = 0; i < count; i++) {
                t *= remain;
            }
            result += t;
            t = 1;

            temp2 /= 10;
        }
        if (num == result) {
            System.out.println(num + " is a armstrong number");
        } else {
            System.out.println(num + " is not a armstrong number");
        }
    }
}