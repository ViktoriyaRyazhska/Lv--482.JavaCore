
public class Appl {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Oleg");
		e1.setRate(5);
		e1.setHours(10);
		e1.Salary();
		e1.Bonuses();
				
		Employee e2 = new Employee();
		e2.setName("Ivan");
		e2.setRate(2);
		e2.setHours(3);
		e2.Salary();
		e2.Bonuses();
				
		Employee e3 = new Employee();
		e3.setName("Oleg");
		e3.setRate(4);
		e3.setHours(2);
		e3.Salary();
		e3.Bonuses();
				
		System.out.println(Employee.getTotalSalary());
		double n = Employee.getTotalSalaryWithBonuses();
		System.out.println(n);
	}

}
