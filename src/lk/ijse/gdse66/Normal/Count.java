package lk.ijse.gdse66.Normal;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 2:39 PM - 12/26/2023
 **/
class Count {
    public static void main(String[] args) {
        int num = 56987;

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        System.out.println(count);      // 5
    }
}