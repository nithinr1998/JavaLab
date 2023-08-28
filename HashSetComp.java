import java.util.*;
public class HashSetComp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashSet<String> set1 = new HashSet<>();
		System.out.print("Enter the size of Set 1 : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int j = i + 1;
			System.out.print("Enter the Element "+ j +": ");
			String var1 = sc.next();
			set1.add(var1);
		}
		System.out.println("\n");
		HashSet<String> set2 = new HashSet<>();
		System.out.print("Enter the size of Set 2 : ");
		int m = sc.nextInt();
		for(int i=0;i<m;i++){
			int j = i + 1;
			System.out.print("Enter the Element "+ j +": ");
			String var2 = sc.next();
			set2.add(var2);
		}	
		System.out.println("*****SET 1*****");
		System.out.println(" ");
		System.out.println(set1);
		System.out.println("*****SET 2*****");
		System.out.println(" ");
		System.out.println(set2);
		
		
HashSet<String> resultSet = new HashSet<>(set1); 
		
		resultSet.retainAll(set2); 
		System.out.println("Elements after retaining the Hash Sets : " +resultSet);
		
		boolean comp = resultSet.equals(set2);
		
		if(comp) {
			System.out.println("Both the Hash Sets are Equal ");
		}else{
			System.out.println("Both the Hash Sets are not Equal ");
		}
	}
}
