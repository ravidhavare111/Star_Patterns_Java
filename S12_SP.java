
public class S12_SP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		         *
//		       *   * 
//		     *       * 
//		   *           *
//		 *               *
		int n = 5;
		for(int i = 1 ; i<= n ; i++) {
			for(int j = n-1 ; j>= i ; j--) {
				System.out.print("  ");
			}
			
			for(int k = 1 ; k < i*2 ; k++) {
				
				if(k>1  &&  k < i*2-1) {
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
