package a5_Conditionals;
import java.util.*;
public class a53_print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the limit for which you wish to print the sequence:");
			int n=sc.nextInt();
			int i=0;
			while(i<=n) {
				System.out.print(i+" ");
				i++;
			}
		}
	}
}
