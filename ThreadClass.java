import java.util.*;
class MultiT extends Thread{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		System.out.println(":: MULTIPLICATION TABLE ::");
		System.out.println("Enter the Number: ");
		int num = Snr.nextInt();
		System.out.println("Multiplication table of " + num + " : ");
		for(int i=1;i<=10;i++){
			System.out.println(num+ " * " + i + " = " + num*i);
		}
	}
}
class PrimeNo extends Thread{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		System.out.println(":: PRIME NUMBERS ::");
		System.out.println("Enter the Limit: ");
		int sz = Snr.nextInt();
		System.out.println("Required Prime Numbers: ");
		for(int i=1;i<=sz;i++){
			if(i==1 || i==0){
				continue;
			}
			else{
				int flag= 1;
				for(int j=2;j<=i/2;j++){
					if(i%j == 0){
						flag=0;
						
break;
					}
				
}
				if(flag == 1){
					System.out.println(i);
				}
			}
		}
	}
}
public class ThreadClass{
	public static void main(String[] args) throws InterruptedException{
		MultiT m = new MultiT();
		m.start();
		m.sleep(2500);
		PrimeNo p = new PrimeNo();
		p.start();
		p.sleep(2500);
	}
}
