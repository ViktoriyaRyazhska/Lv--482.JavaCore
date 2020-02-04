package edu2;

public class Dog {
	private breed mybreed;
	private String name;
	private int age;
	public breed getMybreed() {
		return mybreed;
	}
	public void setMybreed(breed mybreed) {
		this.mybreed = mybreed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(breed mybreed, int age, String name) {
		this.mybreed = mybreed;
		this.age = age;
		this.name = name;
	}
	
}
