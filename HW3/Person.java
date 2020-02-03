package hw_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private int    birthYear;
	
	void input(BufferedReader br) throws IOException {
		System.out.println("What is your first name? ");
		firstName = br.readLine(); 
		setFirstName(firstName);
		System.out.println("What is your last name? ");
		lastName = br.readLine(); 
		setLastName(lastName);
		System.out.println("What is your birth year? ");
		birthYear = Integer.parseInt(br.readLine());
		setBirthYear(birthYear);
	}
	void output() {
		System.out.println("First name: " + getFirstName());
		System.out.println("Last name: " + getLastName());
		System.out.println("Age: " + getAge());
	}
			
	public int getAge() {
		return LocalDate.now().getYear()-getBirthYear();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
