package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 11:21 PM - 12/29/2023
 **/
public class Intro {
    public static void main(String[] args) {
        //create();
        //create2();
        //read();
    }

    public static void create() {
        int[][] arr = new int[5][2];
        System.out.println(Arrays.deepToString(arr));
    }

    public static void create2() {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};
        System.out.println(Arrays.deepToString(arr));
    }

    public static void read() {
        int[][] arr = new int[5][2];

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}