import java.util.*;

public class MapIntf {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Scanner sm = new Scanner(System.in);	
        System.out.println("===============================");
        System.out.println("Demonstartion of Map Interface");
        System.out.println("-> Add, Alter, Remove & Display");
        System.out.println("===============================");
        
        while (true) {
            System.out.println("select a option");
            System.out.println("---------------");
            System.out.println("1. Add an element");
            System.out.println("2. Change an element");
            System.out.println("3. Remove an element");
            System.out.println("4. Display all elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int choice = sm.nextInt();
            sm.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the key: ");
                    String key = sm.nextLine();
                    System.out.print("Enter the value: ");
                    String value = sm.nextLine();
                    map.put(key, value);
                    System.out.println("Element added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the key of the element to change: ");
                    key = sm.nextLine();
                    if (map.containsKey(key)) {
                        System.out.print("Enter the new value: ");
                        value = sm.nextLine();
                        map.put(key, value);
                        System.out.println("Element changed successfully.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the key of the element to remove: ");
                    key = sm.nextLine();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("Element removed successfully.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Elements in the map:");
		for (String dp : map.keySet()) {
			System.out.println("KEY : VALUE => " + " " + dp + ":" + map.get(dp));
		}
                    break;
          
                case 5:
                    System.out.println("Window Terminated...!");
                    System.exit(0);  
                default:
                    System.out.println("Please select a valid option !!");
            }
        }
    }
}
