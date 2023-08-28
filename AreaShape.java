import java.util.*;

public class AreaShape {
  static double Triangle(double b, double h) {
    return 0.5*(b*h);
  }
  
  static int Rectangle(int l, int w ) {
    return l*w;
  }
  
  static double Circle(double r) {
    return Math.PI*(r*r);
  }
  
  static float Square(float a) {
    return a*a;
  }
  
  static int Parallelogram(int b1, int h1) {
    return b1*h1;
  }
  
  static double Trapezuim(double a2, double b2, double h2) {
    return 0.5*(a2+b2)*h2;
  }
  
  static double Ellipse(double a3, double b3) {
    return Math.PI*(a3*b3);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	
System.out.println("*****************************");
	System.out.println("******AREA OF SHAPES******" );
	System.out.println("*****************************");
	System.out.println("<<< ENTER THE REQUIREMENTS >>>" );
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< TRIANGLE >>>>>>>>>>>");
	System.out.println("*****************************");
    	System.out.print("Enter the base of the triangle: ");
   	 double b = sc.nextDouble();
    	System.out.print("Enter the height of the triangle: ");
   	 double h = sc.nextDouble();
    	double triangleArea = Triangle(b, h);
	System.out.println("*****************************");
    	System.out.println("Area of the triangle: " + triangleArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< RECTANGLE >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the Length of the Rectangle: ");
   	 int l = sc.nextInt();
    	System.out.print("Enter the Width of the Rectangle: ");
    	int w = sc.nextInt();
    	int rectangleArea = Rectangle(l, w);
	System.out.println("*****************************");
	System.out.println("Area of the rectangle: " + rectangleArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< CIRCLE >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the radius of the circle: ");
    	double r = sc.nextDouble();
    	double circleArea = Circle(r);
	System.out.println("*****************************");
	System.out.println("Area of the Circle: " + circleArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	
System.out.println("<<<<<<<<<< SQUARE >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the length of the Square: ");
    float a = sc.nextFloat();
    float squareArea = Square(a);
	System.out.println("*****************************");
	System.out.println("Area of the Square: " + squareArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< PARALLELOGRAM >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the base of the Parallelogram: ");
    int b1 = sc.nextInt();
    System.out.print("Enter the Vertical Height of the Parallelogram: ");
    int h1 = sc.nextInt();
    int parallelogramArea = Parallelogram(b1, h1);
	System.out.println("*****************************");
	System.out.println("Area of the Parallelogram: " + parallelogramArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< TRAPEZUIM >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the parallel side length 1 of the Trapezium: ");
    double a2 = sc.nextDouble();
    System.out.print("Enter the parallel side length 2 of the Trapezium: ");
    double b2 = sc.nextDouble();
	System.out.print("Enter the Height of the Trapezuim: ");
    double h2 = sc.nextDouble();
    double trapezuimArea = Trapezuim(a2, b2, h2);
	System.out.println("*****************************");
	System.out.println("Area of the Trapezium: " + trapezuimArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< ELLIPSE >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the minor axis of the Ellipse: ");
    double a3 = sc.nextDouble();
    System.out.print("Enter the major axis of the Ellipse: ");
    
    double b3 = sc.nextDouble();
    double ellipseArea = Ellipse(a3, b3);
	System.out.println("*****************************");
	System.out.println("Area of the Ellipse: " + ellipseArea);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
  }
}
