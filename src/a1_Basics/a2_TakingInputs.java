package a1_Basics;
import java.util.*;

public class a2_TakingInputs {

	public static void main(String[] args) throws Exception {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println('A'+3);	//implicit type conversion

			float c=(float)2.3;
			System.out.println(c);		//explicit or type casting
		}
	}
}