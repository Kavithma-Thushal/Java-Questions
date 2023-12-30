package lk.ijse.gdse66.Arrays.Arrays2D;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 11:35 AM - 12/30/2023
 **/
public class Maximum2D {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {7, 2}, {4, 8}, {2, 5}, {1, 7}};

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);    // 8
    }
}