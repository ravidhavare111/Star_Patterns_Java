
public class S05_S_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4th Pattern
//		* * * * * 
//		  * * * *
//		    * * * 
//		      * * 
//		        *  
		int n = 5;
		for(int i = 1; i<=n ; i++) {          //for loop -> for "jump to next line"
			for(int j = 1 ; j<i ; j++) {      //for loop -> for "space"
				System.out.print("  ");
			}
			for(int k = n ; k>=i ; k--) {     //for loop -> for "*"
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
