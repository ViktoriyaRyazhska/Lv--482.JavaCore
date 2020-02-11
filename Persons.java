
public class Persons {

	public static void main(String[] args) {
		Person[] persons = new Person[6];
		persons[0] = new Student();
		persons[1] = new Student();
		persons[2] = new Teacher();
		persons[3] = new Teacher();
		persons[4] = new Cleaner();
		persons[5] = new Cleaner();
		for (int i = 0; i < persons.length; i++) {
			persons[i].print();
		}
		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Staff) {
				((Staff) persons[j]).salary();

			}
		}
	}
}
