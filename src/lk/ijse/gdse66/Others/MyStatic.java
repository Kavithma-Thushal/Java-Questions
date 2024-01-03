package lk.ijse.gdse66.Others;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 3:52 PM - 1/3/2024
 **/
class Employee {
    String id;
    double salary;
    static String ceoName;

    public void printDetails() {
        System.out.println(id + " : " + salary + " : " + ceoName);
    }
}

public class MyStatic {
    public static void main(String args[]) {
        Employee.ceoName = "Thushal";

        Employee sahan = new Employee();
        sahan.id = "E001";
        sahan.salary = 1000;
        sahan.ceoName = "Kamal";

        Employee nimna = new Employee();
        nimna.id = "E002";
        nimna.salary = 500;
        nimna.ceoName = "Nimal";

        Employee udara = new Employee();
        udara.id = "E003";
        udara.salary = 100000;
        udara.ceoName = "Jagath";

        sahan.printDetails();
        nimna.printDetails();
        udara.printDetails();
    }
}