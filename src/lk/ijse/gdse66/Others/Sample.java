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
        int num = input.nextInt();	//256

        int temp = num;

        int newValue = 0;

        while(num != 0) {
            int remain = num % 10;
            newValue = (newValue*10) + remain;
            num /= 10;
        }

        if(temp == newValue) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}