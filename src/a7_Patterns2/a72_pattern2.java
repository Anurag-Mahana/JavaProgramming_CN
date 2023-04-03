package a7_Patterns2;
import java.util.*;

public class a72_pattern2 {

	public static void main(String[] args) throws Exception {
		try(Scanner sc=new Scanner(System.in)){

			//1. ****
			//	 ****
			//	 ****
			//	 ****
			for(int i=1;i<=4;i++){
				for(int j=1;j<=4;j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			//	2.
			//			1
			//			23
			//			345
			//			4567
			for(int i=1;i<=4;i++) {
				int val=i;
				for(int j=1;j<=i;j++) {
					System.out.print(val);
					val++;
				}
				System.out.println();
			}

			//			3.
			//			ABCD
			//			BCDE
			//			CDEF
			//			DEFG
			for(int i=1;i<=4;i++) {
				int val=i+64;
				for(int j=1;j<=4;j++) {
					System.out.print((char)val);
					val++;
				}
				System.out.println();
			}

			//			4.
			//			1
			//			21
			//			321
			//			4321
			//			54321

			for(int i=0;i<=5;i++) {
				int val=i;
				for (int j=1;j<=i;j++) {
					System.out.print(val);
					val--;
				}
				System.out.println();
			}
			//			5.
			//			#####Pattern for N = 5
			//
			//			E
			//			DE
			//			CDE
			//			BCDE
			//			ABCDE
			//			#####Input format : 
			//				N (Total no. of rows)
			//			5
			//			45
			//			345
			//			2345
			//			12345
			System.out.println();
			for(int i=1;i<=5;i++) {
				int val=5-i;
				for(int j=1;j<=i;j++) {
					System.out.print((char)(val+65));
					val++;
				}
				System.out.println();
				//test for other Systems(1)
			}
		}
	}

}
