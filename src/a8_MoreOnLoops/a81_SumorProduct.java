//Assignment Coding Problem
//Problem Name: Sum or Product
//Problem Level: MEDIUM
//Problem Description: #### Write a program that asks the user for a number N and a choice C.
//And then give them the possibility to choose between computing the sum and computing the product 
//of all integers in the range 1 to N (both inclusive). 
//
//#### If C is equal to - 
//     1, then print the sum
//     2, then print the product
//     Any other number, then print '-1' (without the quotes)
//
//##### Input format : 
//    Line 1 : Integer N
//    Line 2 : Choice C
//
//##### Output Format : 
//     Sum or product according to user's choice
//
//##### Constraints :
//    1 <= N <= 12
// ##### Sample Input 1 : 
//    10
//    1
//
//##### Sample Output 1 : 
//    55
//
//##### Sample Input 2 : 
//    10
//    2


package a8_MoreOnLoops;
import java.util.*;

public class a81_SumorProduct {

	public static void main(String[] args) throws Exception {

		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			System.out.println("Enter a choice: \n1-Print sum upto N \n2-Print Product upto n");
			int ch=sc.nextInt();
			if(ch==1) {
				int sum=0;
				for(int i=0;i<=num;i++) {
					sum+=i;
				}
				System.out.println(sum);
			}
			else if(ch==2) {
				int prod=1;
				for(int i=1;i<=num;i++) {
					prod*=i;
				}
				System.out.println(prod);
			}
			else {
				System.out.println("-1");
			}
		}
		catch(Exception e) {
			System.out.println("Please enter the correct data type.");

		}
	}

}
