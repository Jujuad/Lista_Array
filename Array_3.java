public class Array_3 {

	public static void main(String[] args) {
		
		int[][] a = new int[100][100];
		
		for (int j = 0; j < 100; j++ ) {
            for (int  x = 0; x < 100; x++ ){
  			   a[j][x] = j - x; 
	        }   
        }
		
		System.out.println("Subtração dos indices: " );
		
		for ( int j = 0; j < 100; j++ ) {
            for ( int x = 0; x < 100; x++ ){
            	System.out.println(a[j][x]);
            }
		}
		
		for ( int j = 0; j < 100; j++ ) {
            for ( int x = 0; x < 100; x++ ){
  			   a[j][x] = 7 * (j - x) ; 
            }
		}
		
		System.out.println("Subtração dos indices multiplicados por 7: " );
		
		for ( int j = 0; j < 100; j++ ) {
            for ( int x = 0; x < 100; x++ ){
            	System.out.println(a[j][x]);
            }
		}
	}
}