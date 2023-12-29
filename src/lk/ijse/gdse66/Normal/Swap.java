package lk.ijse.gdse66.Normal;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 7:25 PM - 12/29/2023
 **/
public class Swap {
    public static void main(String[] args) {
        int x = 12;
        int y = 23;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);
    }
}