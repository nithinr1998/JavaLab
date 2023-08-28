import java.util.*;
public class Matrixadd{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the dimensions of both matrix: ");
		int rw = Snr.nextInt();
		int cl = rw;
		int Mtx1[][] = new int[rw][cl];
		int Mtx2[][] = new int[rw][cl];
		int Mtx3[][] = new int[rw][cl];
		System.out.println("Enter the elements in first matrix: ");
		for(int i=0;i<rw;i++){
			for(int j=0;j<cl;j++){
				Mtx1[i][j] = Snr.nextInt();
			}
		}
		System.out.println("The First matrix: ");
		for(int i=0;i<rw;i++){
			for(int j=0;j<cl;j++){
				System.out.print(Mtx1[i][j] + "   ");
			}
			System.out.println(" ");
		}
		System.out.println("Enter the elements in second matrix: ");
		for(int i=0;i<rw;i++){
			for(int j=0;j<cl;j++){
				Mtx2[i][j] = Snr.nextInt();
			}
		}
		System.out.println("The Second matrix: ");
		for(int i=0;i<rw;i++){
			for(int j=0;j<cl;j++){
				System.out.print(Mtx2[i][j] + "   ");
			}
			System.out.println(" ");
		}
		
		System.out.println("The sum of the matrices: ");
		
		for(int i=0;i<rw;i++){
			for(int j=0;j<cl;j++){
				Mtx3[i][j] = Mtx1[i][j] + Mtx2[i][j];
			}
		}
		for(int i=0;i<rw;i++){
			for(int j=0;j<cl;j++){
				System.out.print(Mtx3[i][j] + "   ");
			}
			System.out.println(" ");
		}
	}
}				
