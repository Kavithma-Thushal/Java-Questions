package lk.ijse.gdse66.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:35 PM - 12/26/2023
 **/
class Minimum {
    public static void main(String[] args) {
        int[] arr = {12, 56, 34, 78, 34, 23};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);    // 12
    }
}