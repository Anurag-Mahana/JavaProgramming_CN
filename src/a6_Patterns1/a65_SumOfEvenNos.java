//Coding Problem
//Problem Name: Sum of Even Numbers till N
//Problem Level: EASY
//Problem Description: ####Given a number N, print sum of all even numbers from 1 to N.
//
//
//#####Input Format : 
//    Integer N
//
//#####Output Format : 
//    Required Sum 
// #####Sample Input 1 :
//     6
//#####Sample Output 1 :
//    12

package a6_Patterns1;
import java.util.*;

public class a65_SumOfEvenNos {

	public static void main(String[] args)throws Exception {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the limit till which you want to print the sum:");
			int n=sc.nextInt();
			int i=1,sum=0;
			while(i<=n) {
				if(i%2==0) {
					sum+=i;		
				}
				i++;
			}
			System.out.println("The sum is: "+sum);
		}
	}
}
