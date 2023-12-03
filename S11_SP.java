
public class S11_SP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		         *
//		       *
//		     *
//		   *
//		 *
		int n = 5;
		
		for(int i = 1 ; i<= n ; i++) {
			for(int j = n ; j>= i ; j --) {
				if(j>i) {
					System.out.print("  ");
				}
				else {
					System.out.print(" *");
					
				}
		
			}

			System.out.println();
		}

	}

}
