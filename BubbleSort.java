import java.util.*;
public class BubbleSort{
	int sz;
	int[] Arr;
	public BubbleSort(int n){
		sz = n;
		Arr = new int[sz];
	}
	public void insert(int i, int e){
		Arr[i] = e;
	}
	public void display(int i){
		System.out.print(Arr[i]+ " ");
	}
	public void Sort(int n){
		int temp;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(Arr[i] > Arr[j]){
					temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner Snr= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = Snr.nextInt();
		
BubbleSort arr = new BubbleSort(size);
		for(int i=0; i<size; i++){
			System.out.print("Enter the element: ");
			int val = Snr.nextInt();
			arr.insert(i, val);
		}
		System.out.print("Before sorting: ");
		for(int i=0; i<size; i++){
			arr.display(i);
		}
		System.out.print("\nAfter sorting: ");
		for(int i=0; i<size; i++){
			arr.Sort(size);
			arr.display(i);
		}
	}
}

