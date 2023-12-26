package lk.ijse.gdse66.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:34 PM - 12/26/2023
 **/
class Maximum {
    public static void main(String[] args) {
        int[] arr = {12, 56, 34, 78, 34, 23};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);    // 78
    }
}