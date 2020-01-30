package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	private String firstName, lastName;
	private int birthYear;
	private String Information;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String FName, String LName) {
		this.firstName = FName;
		this.lastName = LName;
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
	public int getAge() throws NumberFormatException, IOException {
		System.out.println("Input the current year");
		int currYear = Integer.parseInt(br.readLine());
		return currYear - this.birthYear;
	} 
	public void input() throws IOException {
		System.out.println("Input some information");
		this.Information = br.readLine();
	}
	public void output() {
		System.out.println(Information);
	}
	public void changeName(String... Change) {
		this.firstName = Change[0];
		if (Change[1] != null)
		{
			this.lastName = Change[1];
		}
	}

}
