

package a7_Patterns2;
import java.util.*;

public class a73_pattern3 {

	public static void main(String []args)throws Exception {
		try(Scanner sc=new Scanner(System.in)){

			//			pattern1
			//			    *
			//			   **
			//			  ***
			//			 ****

			for(int i=1;i<=4;i++) {
				for(int space=1;space<=4-i;space++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			//			pattern2
			//			****
			//			***
			//			**
			//			*
			System.out.println();
			for(int i=1;i<=4;i++) {
				for(int space=1;space<i;space++) {
					System.out.print(" ");
				}
				for(int j=4;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
