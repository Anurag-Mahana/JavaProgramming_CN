//####Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//####1, if the character is an uppercase alphabet (A - Z)
//####0, if the character is a lowercase alphabet (a - z)
//####-1, if the character is not an alphabet
//
//#####Input format : 
//    Single Character
//
//#####Output format : 
//    1 or 0 or -1
//
//#####Constraints :
//    Input can be any character
//
// #####Sample Input 1 : 
//    v
//
//#####Sample Output 1 : 
//    0
//
//#####Sample Input 2 : 
//    V
//
//#####Sample Output 2 : 
//    1
//
//#####Sample Input 3 : 
//
//    #
//
//#####Sample Output 3 : 
//    -1

/* SOLUTION   */

package a6_Patterns1;
import java.util.*;

public class a64_Problem1 {

	public static void main(String []args)throws Exception{
		try(Scanner sc=new Scanner(System.in)){

			System.out.println("Input a charecter:");
			String a=sc.nextLine();
			int n=(int)a.charAt(0);
			if(n>=97 && n<=122) {
				System.out.println("0");
			}
			else if(n>=65 && n<=90) {
				System.out.println("1");
			}
			else
				System.out.println("-1");
		}
	}
}
