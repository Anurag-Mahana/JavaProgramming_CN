package a8_MoreOnLoops;
//Assignment Coding Problem
//Problem Name: Square Root (Integral)
//Problem Level: MEDIUM
//Problem Description: #### Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//#### For eg. if number given is 18, answer is 4.
//
//##### Input format : 
//    Integer N
//
//##### Output Format : 
//    Square root of N (integer part only)
//
//##### Constraints :
//    0 <= N <= 10^8
// ##### Sample Input 1 : 
//    10
//
//##### Sample Output 1 : 
//    3
//
//##### Sample Input 2 : 
//    4
//
//##### Sample Output 2 : 
//    2

import java.util.*;
public class a85_SquareRoot {

	public static void main(String[] args)throws Exception {
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Please enter a number for which you wish to find out the square root of:");
			int num=sc.nextInt();
			int sqrt=0;
			for(int i=0;i<=50;i++) {
				if(i*i<=num)
					sqrt=i;
			}
			System.out.println(sqrt);
			System.out.println((int)Math.sqrt(num));
		}
		catch(Exception E) {
			System.out.println("Invalid input entered!");
		}
	}

}
