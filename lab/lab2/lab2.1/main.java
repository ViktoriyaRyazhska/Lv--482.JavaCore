package Practice6;

public class main {
	public static void main(String[] args) {
//		Person[] person = new Person[3];
//		for(int i =0;i<person.length;i++) {
//			
//		}
		
		Person[] person = {new Student(), new Teacher(), new Cleaner()};
//		person[0] = new Student();
//		person[1] = new Teacher();
//		person[2] = new Cleaner();

		for (int i = 0; i < person.length; i++) {
			person[i].print();
			if (person[i] instanceof Staff) {
				System.out.println(((Staff) person[i]).salary());
			}
		}
	}

}

//		for(int i =0;i<person.length;i++) {
//			
//		}