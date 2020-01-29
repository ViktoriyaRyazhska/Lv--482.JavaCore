
public class Employee {

	private String name;
	private double rate;
	private double hours;
	
	private static double totalSalary;
	private static double totalBonuses;
	private static double totalSalaryWithBonuses;
		
	public Employee() {
		}
	
	public Employee(double rate, double hours) {
		this.rate = rate;
		this.hours = hours;
	}
	
	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double Salary() {
		totalSalary=totalSalary+ rate * hours;
		return rate * hours;
	}
	
	@Override
	public String toString() {
		return "Information about Employee: name: " + name + ", rate: " + rate + ", hours: " + hours;
	}

	public void changeRate(double rate) {
		this.rate=rate;
	}
	
	public double Bonuses() {
		totalBonuses=totalBonuses+ hours*rate*0.1;
		return hours*rate * 0.1;
	}
	
	
	public static double getTotalSalaryWithBonuses() {
		return totalBonuses + totalSalary;
	}

	public static double getTotalSalary() {
		return totalSalary;
	}
}
