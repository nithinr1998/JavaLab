import java.util.Scanner;

class Student {
    String name;
    int science;
    int maths;
    int english;
    int malayalam;

    public Student(String name, int science, int maths, int english, int malayalam) {
        this.name = name;
        this.science = science;
        this.maths = maths;
        this.english = english;
        this.malayalam = malayalam;
    }
}

class Sports {
    int badminton;
    int tennis;
    int volleyball;

    public Sports(int badminton, int tennis, int volleyball) {
        this.badminton = badminton;
        this.tennis = tennis;
        this.volleyball = volleyball;
    }
}

class Result extends Student {
    Sports sports;

    public Result(String name, int science, int maths, int english, int malayalam, Sports sports) {
        super(name, science, maths, english, malayalam);
        this.sports = sports;
    }
    public void displayScore() {
        int academicScore = science + maths + english + malayalam;
        int sportsScore = sports.badminton + sports.tennis + sports.volleyball;
        System.out.println("Science Score: " + science);
        System.out.println("Maths Score: " + maths);
        System.out.println("English Score: " + english);
        System.out.println("Malayalam Score: " + malayalam);
        System.out.println("__________________________");
        System.out.println("Academic Score: " + academicScore);
        System.out.println("__________________________");
        System.out.println("Badminton Score: " + sports.badminton);
        System.out.println("Tennis Score: " + sports.tennis);
        System.out.println("Volleyball Score: " + sports.volleyball);
        System.out.println("__________________________");
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("__________________________");
    }
}
public class ResultDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Academic Details***");
        System.out.print("\n");
        System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        System.out.print("Enter the science score: ");
        int science = sc.nextInt();
        System.out.print("Enter the maths score: ");
        int maths = sc.nextInt();
        System.out.print("Enter the english score: ");
        int english = sc.nextInt();
        System.out.print("Enter the malayalam score: ");
        int malayalam = sc.nextInt();
        System.out.print("\n");

        System.out.println("***Sports Details***");
        System.out.print("\n");
        System.out.print("Enter the badminton score: ");
        
        int badminton = sc.nextInt();
      
        System.out.print("Enter the tennis score: ");
        int tennis = sc.nextInt();
        System.out.print("Enter the volleyball score: ");
        int volleyball = sc.nextInt();
        System.out.print("\n");
        Sports sports = new Sports(badminton, tennis, volleyball);
        Result result = new Result(name, science, maths, english, malayalam, sports);

        System.out.println("Result Details:");
        System.out.println("Name: " + result.name);
        result.displayScore();
    }
}
