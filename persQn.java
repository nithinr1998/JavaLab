import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
       
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp Id: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher Id: " + teacherId);
        System.out.println("-----------------------------");
    }
}

public class persQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            
System.out.println("Enter details of teacher " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter gender: ");
            String gender = sc.next();
            System.out.print("Enter address: ");
            String address = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter empId: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter company name: ");
            String companyName = sc.nextLine();
            System.out.print("Enter qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter subject: ");
            String subject = sc.nextLine();
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            System.out.print("Enter teacher id: ");
            int teacherId = sc.nextInt();

           teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
		}

		System.out.println("\nDetails of all teachers:");
		for (int i = 0; i < n; i++) {
			System.out.println("Details of teacher " + (i + 1));
			teachers[i].display();
		}
	}
}
