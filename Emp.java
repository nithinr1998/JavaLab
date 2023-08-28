import java.util.Scanner;
public class Emp{
	int eno;
	String ename;
	int esalary;
	
	public void get()
	{
		Scanner nw = new Scanner(System.in);
		System.out.println("Enter employee number: ");
		eno = nw.nextInt();
		System.out.println("Enter employee name: ");
		ename = nw.next();
		System.out.println("Enter employee salary: ");
		esalary = nw.nextInt();
	}
	public void display()
	{
		System.out.println("Employee number is "+eno);
		System.out.println("Employee name is "+ename);
		System.out.println("Employee salary is "+esalary);
	}
	public static void main(String[] args){
		int i;
		Scanner nw=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int n=nw.nextInt();
		Emp e[]=new Emp[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Emp();
			

e[i].get();
		}
		for(i=0;i<n;i++)
		{
			e[i].display();
		}
		System.out.println("Enter the eno:");
		int val=nw.nextInt();
		int flag=0;
		for(i=0;i<n;i++)
		{
			if(e[i].eno==val)
			{
				e[i].display();
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Not Found");
		}
	}
}
