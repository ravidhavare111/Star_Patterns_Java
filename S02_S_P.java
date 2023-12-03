public class S02_S_P {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2nd Star Pattern
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 		
		
		int n = 6;
		for(int i = 1 ; i<=n ; i++) {
			for(int j = n ; j>=i ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
