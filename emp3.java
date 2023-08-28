
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    String address;

    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subjectsTaught;

    Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    void display() {
        System.out.println("Emp Id: " + empId);
       
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects taught: " + subjectsTaught);
        System.out.println("-----------------------------");
    }
}

public class emp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of teacher " + (i + 1));
            System.out.print("Enter empId: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter address: ");
            String address = sc.nextLine();
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            System.out.print("Enter subjects taught: ");
            String subjectsTaught = sc.nextLine();

            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
        }

        System.out.println("\nDetails of all teachers:");
        for (Teacher t : teachers) {
            t.display();
        }
    }
}
