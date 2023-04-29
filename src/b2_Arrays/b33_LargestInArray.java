package b2_Arrays;
import java.util.*;

public class b33_LargestInArray {

	public static int maxEle(int arr[]) {
		int size=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static int minEle(int arr[]) {
		int size=arr.length;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter the elements of the array:");
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();

			System.out.println("The max element present in the array is: "+maxEle(arr));
			System.out.println("The min element present in the array is: "+minEle(arr));
		}
	}

}
