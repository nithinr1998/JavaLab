import java.util.*;

public class LkdHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> linkHash = new LinkedHashSet<>();
		
		int n;
		System.out.print("Enter the size of the Set : ");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int j = i + 1;
			System.out.print("Enter the Element " + j + ": ");
			String ele = sc.next();
			linkHash.add(ele);
		}
		
		System.out.println ("LinkedHashSet Contains : " + linkHash);
	}
}
