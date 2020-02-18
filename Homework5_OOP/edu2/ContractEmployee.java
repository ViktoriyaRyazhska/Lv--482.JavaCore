package edu2;

public class ContractEmployee extends Employee implements Payment {
	private String federalTaxIdmember = "federalTaxIdmember's description";
    private int Id;

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public ContractEmployee(int salary, String name) {
        employeeId++;
        this.Id = getEmployeeId();
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void printInfo(){
        System.out.println("ID:" + this.Id);
        System.out.println("name:" + this.name);
        System.out.println("salary:" + this.salary);
    }

    @Override
    public int calculatePay() {
        return salary;
    }

}
