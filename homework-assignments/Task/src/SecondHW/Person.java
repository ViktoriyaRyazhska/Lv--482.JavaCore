package SecondHW;

import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void SetfirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void SetlastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setBirthyear(int birthYear) {
		this.birthYear=birthYear;
	}
	
	public String getFirstname() {
		return this.firstName;
	}
	
	public String getLastname() {
		return this.lastName;
	}
	
	public int getYears() {
		return this.birthYear;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	
	Person(){
		
	}
	
	Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void Input(String firstName,String lastName,int birthYear) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthYear=birthYear;
	}
	
	public void secondInput() throws IOException {
		System.out.println("Please enter info about person");
		this.firstName=br.readLine();
		this.lastName=br.readLine();
		this.birthYear=Integer.parseInt(br.readLine());
	}
	
	public void Output() {
		
		System.out.print("\n" + this.firstName + "\n" + this.lastName + "\n" + this.birthYear + "\n");
		
	}
	
	public int getAge(int birthDate) {
		return LocalDate.now().getYear()-birthDate;
	}
	
	public void changeName(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String toString() {
		return firstName + lastName + birthYear;
	}
}
