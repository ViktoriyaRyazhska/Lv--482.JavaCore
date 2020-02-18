package edu1;

public abstract class NonFlyingBird extends Bird {
	protected String feathers;
	private int layEggs;
	public void fly() {
		System.out.println("I can't fly!");
	}

}
