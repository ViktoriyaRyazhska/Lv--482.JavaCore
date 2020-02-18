package edu1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird[] arr = { new Eagle(), new Penguin(), new Swallow() };
		for (Bird element : arr) {
			element.fly();
			System.out.println("Feathers colour:" + element.getFeathers());
		}
	}

}
