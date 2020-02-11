package practis5;

public class Appl {
	public static void main(String[] args) {
		Person[] p = { new Cleaner(), new Student(), new Teacher(), new Cleaner(), new Student(), new Teacher() };

		for (int i = 0; i < p.length; i++) {
			p[i].print();

			if (p[i] instanceof Staff)
			((Staff) p[i]).salary();
		}
	}

}
