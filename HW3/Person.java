package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
	private String firstName, lastName;
	private int birthYear;

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

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void input(BufferedReader br) throws IOException {
		System.out.println("What is your first name? ");
		firstName = br.readLine();
		setFirstName(firstName);
		System.out.println("What is your last name? ");
		lastName = br.readLine();
		setLastName(lastName);
		System.out.println("What is your birthYear?");
		birthYear = Integer.parseInt(br.readLine());
		setBirthYear(birthYear);
	}

	public void Output() {
		System.out.println(this.firstName +" "+ this.lastName + " " + getAge(birthYear));
	}

	public int getAge(int birthYear) {
		return LocalDate.now().getYear() - birthYear;
	}

	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
