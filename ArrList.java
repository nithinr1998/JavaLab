import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter strings to add to the list (enter 'done' to finish):");
        
       
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            myList.add(input);
            input = scanner.nextLine();
        }
        
        System.out.println("List contents:");
        for (String element : myList) {
            System.out.println(element);
        }
        
        System.out.println("Enter an element to remove:");
        String toRemove = scanner.nextLine();
        myList.remove(toRemove);
        
        System.out.println("Updated list contents:");
        

for (String element : myList) {
            	System.out.println(element);
        }
        
        System.out.println("Enter an element to check for:");
        String toCheck = scanner.nextLine();
        boolean containsElement = myList.contains(toCheck);
        if (containsElement) {
            System.out.println("The list contains " + toCheck);
        } else {
            System.out.println("The list does not contain " + toCheck);
        }
    }
}
