public class Array_4 {

	public static void main(String[] args) {
		
		int b = 50;
		int c = 100;
		int[][] a = new int[b][c];
		
		for ( int j = 49; j >= 0; j-- )	{
            for ( int x = 99; x >= 0; x-- )	{
  			   a[j][x] = j + x; 
	        }   
        }
		
		System.out.println("Soma dos indices: " );
		
		for ( int j = 49; j >= 0; j-- )	{
            for ( int x = 99; x >= 0; x-- )	 {
            	System.out.println(a[j][x]);
            }
		}
	}
}
