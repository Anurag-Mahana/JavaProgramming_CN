//Assignment Coding Problem
//Problem Name: Binary to decimal
//Problem Level: MEDIUM
//Problem Description: ####Given a binary number as an integer N, convert it into decimal and print.
//
//#####Input format : 
//    An integer N in the Binary Format
//
//#####Output format : 
//    Corresponding Decimal number (as integer)
//
//##### Constraints :
//    0 <= N <= 10^9
//
// #####Sample Input 1 : 
//    1100
//
//#####Sample Output 1 : 
//    12

package a8_MoreOnLoops;
import java.util.*;

public class a84_BinaryToDecimal {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the binary Number:");
			int N=sc.nextInt();
			int placeValue=1;
			int decimal=0;
			while(N!=0)
			{  
				int rem=N%10;
				decimal=decimal+(rem*placeValue);
				N=N/10;
				placeValue=placeValue*2;
			}
			System.out.println(decimal);

		}

	}

}
