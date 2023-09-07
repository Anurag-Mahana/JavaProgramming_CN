//
//#### 'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.
//
//
//##### Input format : 
//    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//    First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//    Second line contains 'N' single space separated integers representing the elements in the array/list.
//
//    Third line contains the value of X(integer to be searched in the given array/list)
//
//##### Output format :
//    For each test case, print the index at which X is present or -1, otherwise.
//
//    Output for every test case will be printed in a separate line.
//
//##### Constraints :
//    1 <= t <= 10^2
//    0 <= N <= 10^5
//    -2 ^ 31 <= X <= (2 ^ 31) - 1
//    Time Limit: 1 sec
//
//
// ##### Sample Input 1:
//    1
//    7
//    2 13 4 1 3 6 28
//    3
//
//##### Sample Output 1:
//    4

package b2_Arrays;
import java.util.*;


public class b24_LinearSearch {

	public static void indexArr(int arr[],int key) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag=true;
				System.out.println("The required key is present at position:"+(i+1));
			}
		}
		if(flag==false)
			System.out.println("The given search element is not present!");
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size of the Array:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the elements of the array:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the key element you want to search:");
			int key=sc.nextInt();
			indexArr(arr,key);
		}
	}

}
