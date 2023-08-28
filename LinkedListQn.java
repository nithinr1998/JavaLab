import java.util.*;

public class LinkedListQn {
public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
LinkedList<String> myList = new LinkedList<>();

for(int i=0;i<7;i++){
int j = i + 1;
	System.out.println("Enter the Element "+ j + " : ");
	String var1 = sc.next();
	myList.add(var1);
	}
		
	String rem = myList.remove(3);
	System.out.println("Removed Element : " + rem );	
	System.out.println("Elements after removing the prescribed element : " +    myList );

        	myList.clear();

        	System.out.println("LinkedList after removing all elements: " + myList);
    }
}
