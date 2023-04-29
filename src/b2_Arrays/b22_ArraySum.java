package b2_Arrays;
import java.util.*;

public class b22_ArraySum {
	public static void displayArr(int arr[]) {
		int size= arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int sumArr(int arr[]) {
		int sum=0;
		int size=arr.length;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Program to Print sum of array:");
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int arr[]=new int[size];

			System.out.println("Enter the elements of the array:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("The entered array is:");
			displayArr(arr);
			System.out.println("\n The sum of given array is: "+sumArr(arr));
		}
	}

}
