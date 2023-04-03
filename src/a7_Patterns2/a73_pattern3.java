package a7_Patterns2;
import java.util.*;

//Required code:
//	---1---
//	--121--
//	-12321-
//	1234321



public class a73_pattern3 {

	public static void main(String[] args) throws Exception {
		try(Scanner sc=new Scanner(System.in)){
			for(int i=1;i<=5;i++) {
				for(int space=1;space<=5-i;space++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				for(int k=1;k<=i-1;k++) {
					System.out.print(k);
				}
				System.out.println();
			}

		}
	}

}
