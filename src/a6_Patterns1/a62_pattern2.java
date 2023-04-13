package a6_Patterns1;
import java.util.*;
//Required Pattern:
//1
//23
//456
//78910

public class a62_pattern2 {
	public static void main(String [] args) throws Exception{
		System.out.println("Enter the limit:");
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			System.out.println();
			int i=1;
			int value=1;
			while(i<=n) {
				int j=1;
				while(j<=i) {
					System.out.print(value);
					j++;
					value++;
				}
				System.out.println();
				i++;
			}
		}
	}
}
