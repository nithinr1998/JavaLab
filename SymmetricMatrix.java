import java.util.*;
public class SymmetricMatrix{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the dimension of the matrix :");
		int sz = Snr.nextInt();
		int Arr[][] = new int[sz][sz];
		int Arr1[][] = new int[sz][sz];
		System.out.println("Enter the elements in matrix :");
		for(int i=0;i<sz;i++){
			for(int j=0;j<sz;j++){
				Arr[i][j] = Snr.nextInt();
			}
		}
		System.out.println("The matrix: ");
		for(int i=0;i<sz;i++){
			for(int j=0;j<sz;j++){
				System.out.print(Arr[i][j] + "	");
			}
			System.out.println(" ");
		}
		System.out.println("The Transpose of the matrix: ");
		for(int i=0;i<sz;i++){
			for(int j=0;j<sz;j++){
				Arr1[i][j]=Arr[j][i];
			}
		}
				for(int i=0;i<sz;i++){
			for(int j=0;j<sz;j++){
				System.out.print(Arr1[i][j] + "	");
			}
			System.out.println(" ");
		}
		int flag=0;
		for(int i=0;i<sz;i++){
			
				for(int j=0;j<sz;j++){
				
				if(Arr[i][j] != Arr1[i][j]){
					flag=1;
					break;
			}
			}
		}
		if(flag==1){
			System.out.println("The matrix is not symmetric");
		}
		else{
			System.out.println("The matrix is symmetric");
		}
	
}
}
