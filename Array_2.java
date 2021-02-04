
public class Array_2 {

	public static void main(String[] args) {
	
		int j = 10;
		int[] a = new int[j];
		
		
		for(int x = 9; x >= 0 ; x--) {
			a[x] = x; 
		}
		System.out.println("\n Preenchido em ordem inversa ");
		
		for(int x = 9; x >= 0 ; x--) {
			System.out.println(+a[x]);
		}
		
	}

	}

