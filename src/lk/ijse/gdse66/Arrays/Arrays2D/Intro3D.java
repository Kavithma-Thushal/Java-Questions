package lk.ijse.gdse66.Arrays.Arrays2D;

import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 4:15 PM - 12/30/2023
 **/

public class Intro3D {
    public static void main(String[] args) {
        //create();
        //create2();
        //read();
    }

    public static void create() {
        int[][][] arr = new int[5][3][2];
        System.out.println(Arrays.deepToString(arr));   // [[[0, 0], [0, 0], [0, 0]], [[0, 0], [0, 0], [0, 0]], [[0, 0], [0, 0], [0, 0]], [[0, 0], [0, 0], [0, 0]], [[0, 0], [0, 0], [0, 0]]]
    }

    public static void create2() {
        int[][][] arr = {
                {{1, 2}, {3, 4}, {5, 6}},
                {{7, 8}, {9, 10}, {11, 12}},
                {{13, 14}, {15, 16}, {17, 18}},
                {{19, 20}, {21, 22}, {23, 24}},
                {{25, 26}, {27, 28}, {29, 30}}
        };
        System.out.println(Arrays.deepToString(arr));   // [[[1, 2], [3, 4], [5, 6]], [[7, 8], [9, 10], [11, 12]], [[13, 14], [15, 16], [17, 18]], [[19, 20], [21, 22], [23, 24]], [[25, 26], [27, 28], [29, 30]]]
    }

    public static void read() {
        int[][][] arr = {
                {{1, 2}, {3, 4}, {5, 6}},
                {{7, 8}, {9, 10}, {11, 12}},
                {{13, 14}, {15, 16}, {17, 18}},
                {{19, 20}, {21, 22}, {23, 24}},
                {{25, 26}, {27, 28}, {29, 30}}
        };

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\b\b");
        System.out.print("]");
    }
}