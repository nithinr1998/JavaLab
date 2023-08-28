import java.util.*;
public class stringSort{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the string 1:");
		String str1 = input.nextLine();
		
		System.out.println("Enter the string 2:");
		String str2 = input.nextLine();
		
		System.out.println("Enter the string 3:");
		String str3 = input.nextLine();
		
		System.out.println("Enter the string 4:");
		String str4 = input.nextLine();
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
	}
}

