import java.util.*;
public class stringMani{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1: ");
		String var1 = sc.nextLine();
		System.out.print("Enter the string 2: ");
		String var2 = sc.nextLine();
		System.out.println("Concate :" + var1.concat(var2));
		System.out.println("Equals :" + var1.equals(var2));
		System.out.println("Length :" + var1.length());
		System.out.println("To uppercase :" + var1.toUpperCase());
		System.out.println("Substring :" + var1.substring(0,3));
		System.out.println("CompareTo :" + var1.compareTo(var2));
	}
}	
