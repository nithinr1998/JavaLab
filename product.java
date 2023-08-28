import java.util.*;
class product{
	int pcode;
	String pname;
	int price;

	public void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product code:");
		pcode = sc.nextInt();
		System.out.println("Enter the product name:");
		pname = sc.next();
		System.out.println("Enter the product price:");
		price = sc.nextInt();
	}
	public void display(){
		System.out.println("Product code is: "+pcode);
		System.out.println("Product name is: "+pname);
		System.out.println("Product price is: "+price);
	}
	public static void main(String[] args){
		product ob1 = new product();
		product ob2 = new product();
		product ob3 = new product();
		ob1.get();
		ob1.display();
		ob2.get();
		ob2.display();
		ob3.get();
		
ob3.display();
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
			
System.out.println("first product has lowest price");
		}
		else if(ob2.price<ob1.price && ob2.price<ob3.price)
		{
			System.out.println("second product has lowest price");
		}
		else
		{
			System.out.println("Third product has lowest price");
		}
    }
}
