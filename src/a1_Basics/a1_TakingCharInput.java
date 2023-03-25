package a1_Basics;
import java.util.*;

public class a1_TakingCharInput {

	public static void main(String []args) throws Exception{
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the character you wish to save:");
			String str=sc.next();
			char c=str.charAt(0);
			System.out.println("The entered character is: "+c);
		}
	}
}
