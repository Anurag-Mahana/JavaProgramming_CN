package b2_Arrays;
import java.util.*;

public class b26_incrementArrayValues {

	public static void printArr(int input[]) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
	public static void incArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;
		}
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int arr[]= {1,2,3,4,5};
			printArr(arr);
			System.out.println();
			incArr(arr);
			printArr(arr);
		}
	}

}
