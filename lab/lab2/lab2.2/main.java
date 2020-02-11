
public class main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Pavlo");
		e1.setRate(2000);
		e1.setHour(3);
		Employee e2 = new Employee("Andriy",5000);
		e2.setHour(5);
		Employee e3 = new Employee("Taras",10000,10);
		e1.getBonuses();
		e1.getSalary();
		e2.getBonuses();
		e2.getSalary();
		e3.getBonuses();
		e3.getSalary();
		System.out.println(e1+"\n"+e2+"\n"+e3);
		System.out.println("Totaly sum is:" + Employee.totalSalary());				
	}

}
