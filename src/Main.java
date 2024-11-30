import org.example.Park;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задание 1
        Employee1 employee = new Employee1();
        //employee.someInfo();

        //задание 2
        Employee1[] employees = new Employee1[5];
        employees[0] = new Employee1("Ivanov Ivan", "Programmer", "ivavan@boxmail.com", "8925 356358", 30000, 32);
        employees[1] = new Employee1("Ivanova Rita", "Manager", "ivarita@boxmail.com", "8925 146358", 23000, 54);
        employees[2] = new Employee1("Petrov Max", "Director", "petrmax@boxmail.com", "8925 3501203", 130000, 27);
        employees[3] = new Employee1("Machtet Kiril", "Worker", "kirma@boxmail.com", "8925 100258", 230000, 25);
        employees[4] = new Employee1("Smirnova Irina", "Tester", "smirir@boxmail.com", "8925 780028", 40000, 44);

        // задание 3
        org.example.Park new_park = new org.example.Park("Парк Мира", 1, "+12");
        Park.Attraction attraction1 = new_park.new Attraction("Американские горки", "11-00 до 21-00", 250.00);

    }
}