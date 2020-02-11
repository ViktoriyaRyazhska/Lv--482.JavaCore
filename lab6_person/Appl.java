package lab6_person;

public class Appl {

	public static void main(String[] args) {
		Person[] pr = new Person[3];
		pr[0] = new student();
		pr[1] = new Cleaner();
		pr[2] = new Teacher();

		for (int i = 0; i < pr.length; i++) {
			pr[i].print();
			if (pr[i] instanceof Staff)
			((Staff)pr[i]).salary();
		}
	}

}
