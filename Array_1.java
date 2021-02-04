
public class Array_1 {

	public static void main(String[] args) {
		
		int j = 9;
		int[] a = new int[j];
		
		for(int x = 0; x < j; ++x) {
			a[x] = x;
		}
		System.out.println("\n Preenchido com o valor de seu indice");
		
		for(int x = 0; x < j; ++x) {
			System.out.println(+a[x]);
		}
		System.out.println("\n");
		
		for(int x = 0; x < j; ++x) {
			a[x] = x*3;
		}
		
		System.out.println("Multiplicado por 3 ");
		
		for(int x = 0; x < j; ++x) {
			System.out.println(+a[x]);

	}
	}

}
