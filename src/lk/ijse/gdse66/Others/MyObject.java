package lk.ijse.gdse66.Others;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 6:30 PM - 1/3/2024
 **/
class Person {
    String name = "Thushal";
}

class MyObject {
    public static void main(String[] args) {
        Person person = new Person();
        print(person);
    }

    public static void print(Object obj) {
        Person person = (Person) obj;
        System.out.println("My name is " + person.name);
    }
}