
public class Appl {

	public static void main(String[] args) {
		Employee e1 = new Employee("Igor", 10);
        e1.setHours(21);
        Employee e2 = new Employee();
        e2.setName("Ola");
        e2.setRate(5);
        e2.setHours(5);
        Employee e3= new Employee("Asd",3,4);
        System.out.println("TotalSum = "+Employee.getTotalSum());
        System.out.println("getSalary e1s = "+e1.getSalary());
        System.out.println("Bonuses 10% = "+e1.getBonuses());
        System.out.println("Change Rate "+ e1.changeRate(7));
        System.out.println(e1);
        System.out.println("getSalary e1s = "+e2.getSalary());
        System.out.println("Bonuses 10% = "+e2.getBonuses());
        System.out.println("Change Rate "+ e2.changeRate(7));
        System.out.println(e2);
        System.out.println("getSalary e2s = "+e2.getSalary());
        System.out.println("Bonuses 10% = "+e3.getBonuses());
        System.out.println("Change Rate "+ e3.changeRate(6));
        System.out.println(e3);
		
	}

}
