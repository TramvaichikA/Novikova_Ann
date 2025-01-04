public class Employee {

    String fullName;
    String post;
    String email;
    String phone;
    double salary;
    int age;

    public Employee() {
        fullName = "Краморов Иван Семенович";
        post = "Программист";
        email = "kramIvan@gmail.ru";
        phone = "8 920 613-66-02";
        salary = 56000;
        age = 34;
    }

    public Employee(String fullName, String post, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void someInfo() {
        System.out.println("ФИО сотрудника: " + fullName);
        System.out.println("Должность сотрудника:" + post);
        System.out.println("Возраст: " + age);
        System.out.println("e-mail: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);

    }


}
