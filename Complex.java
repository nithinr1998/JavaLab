import java.util.*;
public class Complex{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the real part of first imaginary number: ");
		int r1 = Snr.nextInt();
		System.out.println("Enter the coefficient of the first imaginary constant: ");
		int i1 = Snr.nextInt();
		System.out.println("Enter the real part of second imaginary number: ");
		int r2 = Snr.nextInt();
		System.out.println("Enter the coefficient of the second imaginary constant: ");
		int i2 = Snr.nextInt();
		System.out.println("The first imaginary number is "+r1+" + "+i1+"i");
		System.out.println("The second imaginary number is "+r2+" + "+i2+"i");
		int r3=r1+r2;
		int i3=i1+i2;
	      System.out.println("The sum of the two imaginary number is "+ r3 +" + "+ i3 +"i");
	}
}
