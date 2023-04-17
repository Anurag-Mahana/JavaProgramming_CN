package b1_Functions;
import java.util.*;

public class b13_PrintPrimeNosTillLimit {

	public static boolean checkPrime(int x){
		int dividend=x;
		int divisor=2;
		while (divisor<dividend){
			if (dividend%divisor==0)
				return false;

			divisor++;
		}
		return true;
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the limit:");
			int num=sc.nextInt();
			for(int i=2;i<=num;i++) {
				if(checkPrime(i)==true) {
					System.out.print(i+" ");
				}
			}

		}
	}

}
