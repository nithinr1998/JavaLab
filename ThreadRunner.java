import java.util.*;
class Fibonacci implements Runnable{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3;
		System.out.println(":: FIBONACCI NUMBERS ::");
		System.out.print("Enter the limit: ");
		int sz = Snr.nextInt();
		System.out.println("The Required Fibonacci Number(s): ");
		for(int i=0;i<sz;i++){
			System.out.print(n1+ " ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
class EvenNo implements Runnable{
	public void run(){
		int uplmt, lwlmt;
		Scanner Snr = new Scanner(System.in);	
		System.out.println("\n:: EVEN NUMBERS ::");
		System.out.println("Enter the Lower Limit: ");
		lwlmt = Snr.nextInt();
		System.out.println("Enter the Upper Limit: ");
		uplmt = Snr.nextInt();
		System.out.println("The Required Even Number(s): ");
		for(int i=lwlmt; i<=uplmt; i++){
			if(i%2 == 0){
				
System.out.print(i + " ");
			}
		}
	}
}
public class ThreadRunner{
	public static void main(String[] args) throws InterruptedException{
		Fibonacci obj1 = new Fibonacci();
		Thread a = new Thread(obj1);
		a.start();
		a.sleep(2500);
		EvenNo obj2 = new EvenNo();
		Thread b = new Thread(obj2);
		b.start();
		b.sleep(2500);
	}
}
