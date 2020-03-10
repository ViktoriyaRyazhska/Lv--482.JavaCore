package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Random;

public class shopper extends Human implements Serializable {

	private int id;
	private int idCompany;

	shopper() {

	}

	Random rand = new Random();

	shopper(String name, String surname, int age) {
		this.setFirstName(name);
		this.setLastName(surname);
		this.setAge(age);
	}

	public void setId() {
		this.id = rand.nextInt(200);
	}

	public int getId() {
		return this.id;
	}

	@Override
	public void print() {
		System.out.println(this.getFirstName());
		System.out.println(this.getLastName());
		System.out.println(this.getAge());
	}

	@Override
	public shopper input(BufferedReader br) throws IOException {
		shopper temp = new shopper("1", "1", 2);
		System.out.println("Please enter FirstName: ");
		temp.setFirstName(br.readLine());
		System.out.println("Please enter LastName: ");
		temp.setLastName(br.readLine());
		System.out.println("Please enter Age: ");
		temp.setAge(Integer.parseInt(br.readLine()));
		System.out.println("Please enter IdCompany");
		temp.setIdCompany(Integer.parseInt(br.readLine()));
		temp.setId();
		return temp;
	}

	@Override
	public String toString() {
		return "Name is" + this.getFirstName() + "Surname is" + this.getLastName() + "Age is" + this.getAge() + "id is"
				+ this.getId() + "IdCompany is : " + this.getIdCompany();
	}

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

}

class ComporatorAge implements Comparator<shopper> {

	@Override
	public int compare(shopper o1, shopper o2) {
		return o1.getAge() - o2.getAge();
	}

}

class ComporatorName implements Comparator<shopper> {

	@Override
	public int compare(shopper o1, shopper o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
