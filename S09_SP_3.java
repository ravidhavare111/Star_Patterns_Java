public class S09_SP_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 * * * * * * * * *
//		   * * * * * * * 
//		     * * * * * 
//		       * * * 
//		         * 
		
		int n = 5;
		for(int i = n ; i>= 1 ; i--) {
			for(int j = n ; j> i ; j--) {
				System.out.print("  ");
			}
			for(int k = 1 ; k< i*2 ; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		

	}

}
