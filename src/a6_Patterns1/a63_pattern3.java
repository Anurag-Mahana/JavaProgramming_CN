package a6_Patterns1;
import java.util.*;

//    1
//   23
//  456
// 78910


public class a63_pattern3 {

	public static void main(String[] args) throws Exception {

		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the limit:");
			int n=sc.nextInt();
			int i=1;
			int val=1;
			while(i<=n) {
				int space=1;
				while(space<=n-i) {
					System.out.print(" ");
					space+=1;
				}
				int j=1;
				while(j<=i) {
					System.out.print(val);
					val+=1;
					j+=1;
				}
				System.out.println();
				i+=1;
			}
		}
	}

}
