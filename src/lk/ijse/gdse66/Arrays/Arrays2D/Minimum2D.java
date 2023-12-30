package lk.ijse.gdse66.Arrays.Arrays2D;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 11:49 AM - 12/30/2023
 **/
public class Minimum2D {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println(min);    // 1
    }
}