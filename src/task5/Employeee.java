package task5;

import java.util.Scanner;

public class Employeee {

	private String name;
	private int departmentNumber;
	private double salary;

	public Employeee(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employeee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		if (departmentNumber != other.departmentNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Employeee[] emp = new Employeee[5];
		emp[0] = new Employeee("Ivan", 1, 250.5);
		emp[1] = new Employeee("Oleg", 2, 275.3);
		emp[2] = new Employeee("Pavlo", 3, 280.4);
		emp[3] = new Employeee("Stepan", 4, 295.7);
		emp[4] = new Employeee("Vitalii", 5, 300.0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of department:");
		int a = 0;
		a = Integer.parseInt(sc.nextLine());
		sc.close();
		//
		boolean key = true;
		for (int i = 0; i < 5; i++) {
			if ((a > 0) && (a <= 5) && emp[i].getDepartmentNumber() == a) {
				// a = i;
				System.out.println("Employeee foud: " + emp[i]);
				key = false;
				break;
			}
		}

		if (key) {
			System.out.println("invalid number");
		}
	}

}
