package b1_Functions;
import java.util.*;

public class b12_checkPrimeFun {
	public static boolean isCheckPrime(int x) {
		int dividend=x;
		int divisor=2;
		while(dividend>divisor) {
			if(dividend%divisor==0) {
				return false;
			}
			divisor+=1;
		}
		return true;
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the number for which you want to check Prime:");
			int num=sc.nextInt();
			isCheckPrime(num);
			if(isCheckPrime(num)==true) {
				System.out.println("Number is prime");
			}
			else
				System.out.println("Number is not prime");
		}
	}
}
