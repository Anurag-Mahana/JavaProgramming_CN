package b1_Functions;
import java.util.*;

//function to print value of nCr
public class b11_functionsExample {
	
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
			}
		return fact;
	}

	public static void main(String args[]) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter a the  Value of N:");
			int n=sc.nextInt();
			System.out.println("Enter the value of R:");
			int r=sc.nextInt();
			int val=fact(n)/(fact(r)*fact(n-r));
			System.out.println("The value of nCr is :"+val);
		}
	}
}


/*
ncr=

n!/r!*(n-r)!
	
func for fact
fact(int n){
	return n*fact(n-1);
}

for(int i=1;i<=n;i++){
fact=fact*i;
}

*/