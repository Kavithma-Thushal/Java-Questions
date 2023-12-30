package lk.ijse.gdse66.Arrays.Arrays2D;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 5:23 PM - 12/30/2023
 **/
public class ArrayIntro {
    public static void main(String[] args) {
        //Array1D();
        //Array2D();
        //Array3D();
    }

    public static void Array1D() {
        int[] arr = {12, 23, 34, 45, 56};
        System.out.println(arr[2]);     //34
        System.out.println(arr.length);   //5
    }

    public static void Array2D() {
        int[][] arr2D = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};
        System.out.println(arr2D[3][0]);    //2
        System.out.println(arr2D.length);     //5
        System.out.println(arr2D[0].length);     //2
    }

    public static void Array3D() {
        int[][][] arr3D = {
                {{1, 2}, {3, 4}, {5, 6}},
                {{7, 8}, {9, 10}, {11, 12}},
                {{13, 14}, {15, 16}, {17, 18}},
                {{19, 20}, {21, 22}, {23, 24}},
                {{25, 26}, {27, 28}, {29, 30}}
        };
        System.out.println(arr3D[3][1][0]);     //21
        System.out.println(arr3D.length);       //5
        System.out.println(arr3D[0].length);       //3
        System.out.println(arr3D[0][0].length);       //2
    }
}