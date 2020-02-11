package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Employee {
	private String name;
	private int departmentNumber;
	private int salary;
	
	Employee(){
		
	}
	
	Employee(String name,int departmentNumber,int salary){
		this.name=name;
		this.departmentNumber=departmentNumber;
		this.salary=salary;
	}
	
	public void Input(BufferedReader br) throws IOException {
		System.out.print("Enter values");
		this.name=br.readLine();
		this.departmentNumber=Integer.parseInt(br.readLine());
		this.salary=Integer.parseInt(br.readLine());
	}
	
	public void output() {
	
	}
	
	@Override
	public String toString() {
		return this.name + this.departmentNumber + this.salary;
	}

}
