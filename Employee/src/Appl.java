
public class Appl {

	public static void main(String[] args) {
		Employee e1 = new Employee("ooo", 10);
		e1.setHours(21);
		Employee e2 = new Employee();
		e2.setName("Ola");
		e2.setRate(5);
		e2.setHours(5);
		Employee e3= new Employee("asd",3,4);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(Employee.getTotalSum());
		System.out.println(e1.getSalary());
		System.out.println(e1.getBonuses());
		
	}

}
