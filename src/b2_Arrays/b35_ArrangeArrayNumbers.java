//Problem Name: Arrange Numbers in the Array
//Problem Level: EASY
//Problem Description: #### You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array. 
//#### Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2. 
//
//##### Note: 
//    You need not print the array. You only need to populate it.

//##### Input Format :
//    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//    The first and the only line of each test case or query contains an integer 'N'.
//
//##### Output Format :
//    For each test case, print the elements of the arra/listy separated by a single space.
//
//    Output for every test case will be printed in a separate line.
//
//##### Constraints :
//    1 <= t <= 10^2
//    0 <= N <= 10^4
//
//    Time Limit: 1sec
// ##### Sample Input 1 : 
//    1
//    6
//##### Sample Output 1 :
//    1 3 5 6 4 2
//
//##### Sample Input 2 : 
//    2
//    9
//    3
//##### Sample Output 2 :
//    1 3 5 7 9 8 6 4 2
//    1 3 2

package b2_Arrays;
import java.util.*;

public class b35_ArrangeArrayNumbers {

	public static void fillArr(int arr[]) {
		int n=arr.length;
		int val=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				val=i;
				System.out.print(val);
			}
			System.out.print(val);
		}
		for(int i=(n-1)/2;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(j%2==0) {
					val=j;
				}
			}

			//			System.out.println(val);
		}

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size of the array:");
			int n=sc.nextInt();
			int[] arr=new int[n];


			int s=0;
			int e=n-1;
			int val=1;
			int mid=n/2;
			arr[mid]=n;
			while((s<=(n-1)/2) && (e>=((n-1)/2)+1)) {
				arr[s]=val;
				val++;
				arr[e]=val;
				val++;
				s++;
				e--;
			}

			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}



		}
		catch(Exception e) {
			System.out.println("Invalid data type entered for input!");
		}
	}

}
