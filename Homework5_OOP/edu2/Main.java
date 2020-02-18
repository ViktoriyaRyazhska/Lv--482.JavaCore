package edu2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[4];
        arr[0] = new SalariedEmployee(1, 24, "18", "John");
        arr[1] = new SalariedEmployee(5, 20, "10", "James");
        arr[2] = new SalariedEmployee(9, 18, "5", "Richard");
        arr[3] = new ContractEmployee(20000, "Jeremy");

        for (Employee element : arr) {
            element.printInfo();
            System.out.println();
        }
	}

}
