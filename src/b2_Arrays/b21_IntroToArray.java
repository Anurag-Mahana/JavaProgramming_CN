package b2_Arrays;
import java.util.*;

public class b21_IntroToArray {

	public static void main(String[] args)throws Exception {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the elements of the array:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("The elements in the array is:");
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+"|");
			}
		}
		catch(Exception e) {
			System.out.println("Invalid input type");
		}
	}

}
