
public class S13_SP_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 *               * 
//		   *           * 
//		     *       *
//		       *   * 
//		         * 
		int n = 5;
		for(int i = 1 ; i<= n ;i++) {
			for(int j = 1 ; j<i ; j++) {
				System.out.print("  ");
			}
			
			for(int k = n*2 ; k>= i*2 ; k--) {
				
				if(k<n*2  &&  k>(i*2)) {
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
