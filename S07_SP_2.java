public class S07_SP_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		        *                                2nd Approach 
//		      *   * 
//		    *   *   * 
//		  *   *   *   * 
//		*   *   *   *   * 
		int n = 5;
		
		for(int i = 1 ; i<= n ; i++) {
			for(int j = n ; j>= 1 ; j--) {
				if(j > i) {
					System.out.print("  ");
				}
				else {
					System.out.print("  * ");
				}
			}
			System.out.println();
		}

	}

}
