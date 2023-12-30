package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 11:21 PM - 12/29/2023
 **/

/**
 * Input  = int[][] arr = new int[5][2];
 * Output = [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]
 * There are rows & columns
 * rows = 5
 * columns = 2
 * arr.length = 5
 * arr[0].length = 2
 */
public class Intro2D {
    public static void main(String[] args) {
        //create();
        //create2();
        //read();
    }

    public static void create() {
        int[][] arr = new int[5][2];                    // Dimensional Array
        System.out.println(Arrays.deepToString(arr));   // [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]
    }

    public static void create2() {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};       // Array Literal or Initialization List
        System.out.println(Arrays.deepToString(arr));                 // [[5, 3], [7, 2], [4, 8], [2, 5], [1, 7]]
    }

    public static void read() {
        int[][] arr = new int[5][2];

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);                // [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]
                if (j == 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.print(", ");
        }
        System.out.print("\b\b");
        System.out.print("]");
    }
}