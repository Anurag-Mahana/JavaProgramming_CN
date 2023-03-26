//Problem Name: Number Pattern
//Problem Level: EASY
//Problem Description: ####Print the following pattern
//####Pattern for N = 4
//
//    1
//    23
//    345
//    4567
//
//
//#####Input Format : 
//    N (Total no. of rows)
//
//#####Output Format :
//    Pattern in N lines
// #####Sample Input 1 :
//    3
//
//#####Sample Output 1 :
//    1
//    23
//    345

package a6_Patterns1;
import java.util.*;
public class a66_pattern {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the limit:");
			int n=sc.nextInt();
			int i=1,val=1;
			while(i<=n) {
				int j=1;
				val=i;
				while(j<=i) {
					System.out.print(val);
					j++;
					val++;
				}
				System.out.println();
				i++;
			}
		}
	}
}
