package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class Company extends shopper {
	private String name;
	private double price;
	private int counter;
	private int id;

	Company() {
	}

	Random rand = new Random();

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = rand.nextInt(100);
	}

	public double getPrice() {
		if (counter > 2) {
			return price * 0.20;
		} else {
			return price;
		}
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company input(BufferedReader br) throws IOException {
		Company temp = new Company();
		System.out.println("Please enter name");
		temp.setName(br.readLine());
		System.out.println("Please enter price: ");
		temp.setPrice(Integer.parseInt(br.readLine()));
		temp.setId();
		return temp;
	}

	public void printCompany() {
		this.getName();
		this.getId();
	}

	@Override
	public String toString() {
		return "name is : " + name + "price is : " + price + "id is : " + id;
	}

}
