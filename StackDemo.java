import java.util.*;
public class StackDemo {
public static void main (String args []) {	
Scanner sc = new Scanner(System.in);
Stack<String> mystack = new Stack<String>();	
	for(int i=0;i<5;i++){
		int j = i + 1;
		System.out.println("Enter the Element "+ j + " : ");
		String var1 = sc.next();
		mystack.add(var1);
		}
		
		System.out.println("Stack : " + mystack);
		
		String rem_ele = mystack.remove(2);

		System.out.println("Removed element : " + rem_ele);	
		
		System.out.println("Final Stack: " + mystack);
	}
}
