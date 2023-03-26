package a6_Patterns1;

//	Required Pattern:
//	1
//	12
//	123
//	1234


public class a61_pattern1_whileLoop {

	public static void main(String [] main)throws Exception{
		
		

		//		int i=1;
		//		while(i<=5) {
		//			int j=1;
		//			while(j<=i) {
		//				System.out.print(j);
		//				j=j+1;
		//			}
		//			System.out.println();
		//			i=i+1;
		//		}

		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
