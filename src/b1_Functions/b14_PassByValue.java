package b1_Functions;
import java.util.*;

public class b14_PassByValue {

	public static void increment(int y) {
		y+=1;
	}
	
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int n=10;
			increment(n);
			System.out.println(n);
		}
	}
}