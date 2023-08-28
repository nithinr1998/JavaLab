import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapQn{
	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		HashMap<String, String> HM = new HashMap<>();
		
        		System.out.println("===================================");
        		System.out.println("Demonstration of HashMap to TreeMap");
        		System.out.println("===================================");
		
System.out.print("Enter the limit: ");
		int n = sm.nextInt();
		sm.nextLine();
		
		for(int i=0;i<n;i++){
			int j = i + 1;
			System.out.print("Enter the key set " + j + ": ");
			String key = sm.nextLine();
			System.out.print("Enter the value: ");
			String value = sm.nextLine();
			HM.put(key, value);
		}
		System.out.println("Elements added to map successfully..!!");
		System.out.println("Elements in the HashMap: ");
		for(String dp : HM.keySet()) {
			System.out.println("KEY : VALUE => " + " " + dp + ":" + HM.get(dp));
		}
		
		TreeMap<String, String> TM = new TreeMap<>(HM);
		
		System.out.println("Elements in the TreeMap: ");
		for(String dp : TM.keySet()) {
			System.out.println("KEY : VALUE => " + " " + dp + ":" + TM.get(dp));
		}
	}
}
