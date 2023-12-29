package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 11:21 PM - 12/29/2023
 **/
public class Intro {
    public static void main(String[] args) {
        create();
        create2();
    }

    public static void create() {
        int[][] arr = new int[5][2];
        System.out.println(Arrays.deepToString(arr));
    }

    public static void create2() {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};
        System.out.println(Arrays.deepToString(arr));
    }
}