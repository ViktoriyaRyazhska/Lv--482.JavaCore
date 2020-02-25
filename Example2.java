
public class Example2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {		//i = 2 j=0 j =1
			for (int j = 0; j < i; j++) {
				System.out.print('*');	
			}
			System.out.println();
		}
		System.out.println();
		int n = 1;
		while (++n < 5) {
		for (int i = 0; i < n; i++) {
			System.out.print('*');	
			}
			System.out.println();
		}
	}

}
