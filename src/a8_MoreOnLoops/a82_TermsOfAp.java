//Assignment Coding Problem
//Problem Name: Terms of AP
//Problem Level: MEDIUM
//Problem Description: #### Write a program to print first x terms of the series 3N + 2 
//which are not multiples of 4. 
//
//##### Input format : 
//    Integer x
//
//##### Output format : 
//    Terms of series (separated by space)
//
//##### Constraints :
//    1 <= N <= 1,000
// ##### Sample Input 1 : 
//    10
//
//##### Sample Output 1 : 
//    5 11 14 17 23 26 29 35 38 41
//
//##### Sample Input 2 : 
//    4
//
//##### Sample Output 2 : 
//    5 11 14 17

package a8_MoreOnLoops;
import java.util.*;

public class a82_TermsOfAp {

	public static void main(String[] args)throws Exception {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter a number");
			int num=sc.nextInt();
			int count=0;
			for(int i=1;i<=20;i++) {
				int val=3*i+2;
				if(val%4!=0) {
					count+=1;
					if(count>num) {
						break;
					}
					System.out.print(val+" ");
				}
			}

		}
		catch(Exception e) {
			System.out.println("Incorrect input");
		}
	}

}
