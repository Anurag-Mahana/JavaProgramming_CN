package a5_Conditionals;
import java.util.*;

public class a52_largestOfThree {

	public static void main(String[] args) throws Exception{
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the three numbers you wish to compare:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();

			if(a>b&&a>c)
				System.out.println(a+" is the greatest of the three inputs");
			else if(b>c)
				System.out.println(b+" is the greatest among the three inputs");
			else
				System.out.println(c+" is the greatest among the three inputs");
		}
	}
}
