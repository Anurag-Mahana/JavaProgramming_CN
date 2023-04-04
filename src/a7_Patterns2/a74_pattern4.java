package a7_Patterns2;
import java.util.*;





public class a74_pattern4 {

	public static void main(String[] args) throws Exception {
		try(Scanner sc=new Scanner(System.in)){

			//1		Required code:
			//			---1---
			//			--121--
			//			-12321-
			//			1234321
			for(int i=1;i<=5;i++) {
				for(int space=1;space<=5-i;space++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				int p=i-1;
				for(int k=1;k<=i-1;k++) {
					System.out.print(p);
					p--;
				}
				System.out.println();
			}

			System.out.println();
			System.out.println();
			//2			Required code:
			//				55555
			//				4444
			//				333
			//				22
			//				1

			for(int i=1;i<=5;i++) {
				int val=5-i;
				for(int j=5;j>=i;j--) {
					System.out.print(val+1);
				}
				System.out.println();
			}


			System.out.println();
			System.out.println();
			//2			Required code:
			//		   *
			//		  ***
			//		 *****
			//		*******

			for(int i=1;i<=5;i++) {

				for(int space=1;space<=5-i;space++) {
					System.out.print(" ");
				}

				for(int j=1;j<=2*i-1;j++) {
					System.out.print('*');
				}
				System.out.println();
			}

			System.out.println();
			System.out.println();
			//2			Required code:
			//           1
			//          232
			//         34543
			//        4567654
			for(int i=1;i<=4;i++) {

				for(int space=1;space<=4-i;space++) {
					System.out.print(" ");
				}
				int val=i;
				for(int j=1;j<=i;j++) {
					System.out.print(val);
					val++;
				}
				int p=val-1;
				for(int k=1;k<=i-1;k++) {
					p--;
					System.out.print(p);

				}
				System.out.println();
			}

			System.out.println();
			System.out.println();
			//2			Required code:
			//		 	       *
			//			      ***
			//			     *****
			//			      ***
			//			       *

			int n=5;
			for(int i=1;i<=n;i++) {

				for(int space=1;space<=n-i;space++) {
					System.out.print(" ");
				}

				for(int j=1;j<=2*i-1;j++) {
					System.out.print('*');
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++) {

				for(int space=1;space<=i;space++) {
					System.out.print(" ");
				}

				for(int j=2*n+1;j>=2*i+3;j--) {
					System.out.print('*');
				}
				System.out.println();
			}

		}
	}

}
