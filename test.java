
public class test {

	public static void main(String[] args) {
	
		Integer[] a = new Integer[5];
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println();
		
		a[1] = 2;
		a[a[1]++] = 3; // a[2] =3; a[1] = a[1] + 1 = 2+1=3
		
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a[0]);
		System.out.println(a[4]);
	

	}

}
