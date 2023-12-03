
public class S08_SP_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		        *                              1st approach
//		      * * *
//		    * * * * *
//		  * * * * * * * 
//		* * * * * * * * * 
		
		int n = 5;
		for(int i = 1 ; i<= n ; i++) {
			for(int j = n-1; j >= i ; j--) {
				System.out.print("  ");
			}
			for(int k = 1 ; k<= i ; k++) {
				System.out.print("* ");
			}
			for(int m = 2 ; m<=i ; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
