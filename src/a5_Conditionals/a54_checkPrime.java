package a5_Conditionals;
import java.util.*;

public class a54_checkPrime {

	public static void main(String[] args) throws Exception {

		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the number for which you want to check Prime:");
			int dividend=sc.nextInt();
			int divisor=2;
			boolean isDivided=false;

			while(divisor<dividend) {
				if(dividend%divisor==0) {
					isDivided=true;
				}
				divisor+=1;
			}
			if(isDivided==true)
				System.out.println(dividend+" is not a prime number");
			else
				System.out.println(dividend+" is a prime number");
		}
	}
}
