package a5_Conditionals;

import java.util.*;

public class a51_ifElse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the number for which you wish to check even or odd:");
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println(num+" is an even number.");
			}
			else {
				System.out.println(num+" is an odd number.");
			}
		}
	}
}
