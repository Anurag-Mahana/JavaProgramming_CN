//Program to convert Fareinheit to Celcius:

package a1_Basics;
import java.util.*;

public class a3_showcasingOperators {
	public static void main(String []args) throws Exception{
		try(Scanner sc=new Scanner(System.in)){

			System.out.println("Hello world!");
//			System.out.println("Enter the temp value in Farenheit:");
//			int f=sc.nextInt();
//
//			//int c=(5/9)*(f-32);//will return incorrect value as int/int wont give values in decimal.
//
//			//int c=(5*(f-32))/9; //should work
//
//			int c=(int)((5.0/9.0)*(f-32));
//
//			System.out.println("The Celcius equal value is equal to: " +c);
			
			double a = 6.0 / 4;
            int b  = 6 / 4;
            double d = a + b;
            System.out.println(a+" "+b+" "+d);
		    
            int var1 = 5;
            int var2 = 6;
            System.out.print(var1 > var2);
		    

		}

	}
}
