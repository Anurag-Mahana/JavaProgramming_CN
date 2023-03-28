//     1
//    23
//   456
//  78910


package a7_Patterns2;
import java.util.*;

public class a71_pattern1 {

	public static void main(String []args) {	
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the limit:");
			int limit=sc.nextInt();
			int i=1;
			int value=1;

			while(i<=limit) {
				int space=1;
				while(space<=limit-i) {
					System.out.print(" ");
					space++;
				}

				int j=1;
				while(j<=i) {
					System.out.print(value);
					value++;
					j++;
				}
				System.out.println();
				i++;
			}
		}
	}
}
