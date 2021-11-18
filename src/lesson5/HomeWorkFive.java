package src.lesson5;

/**
 * Java1.HomeWorkFive
 *
 * @author Pavel.Stolyarov
 * @version 18.11.2021
 */

public class HomeWorkFive {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivaivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Kistochkin Pavel", "Artist", "kistpav@mailbox.com", "892312313", 50000, 45);
        empArray[2] = new Employee("Pixelev Andrey", "Game developer", "pixand@mailbox.com", "892312314", 100000, 35);
        empArray[3] = new Employee("Bond James", "Agent M6", "bond007@M6.com", "007", 0, 41);
        empArray[4] = new Employee("Malinova Marina", "Chef", "malimari@mailbox.com", "892312315", 75000, 32);
        for (Employee employee : empArray)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}