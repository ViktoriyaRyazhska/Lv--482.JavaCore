
package project;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Human {

	private String firstName;
	private String lastName;
	private int age;

	Human(){}
	
	public abstract void print();

	public abstract shopper input(BufferedReader br) throws IOException;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compare(shopper o1, shopper o2) {
		return o1.getAge() - o2.getAge();
	}

}
