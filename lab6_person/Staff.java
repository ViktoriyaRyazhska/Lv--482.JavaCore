package lab6_person;

public abstract class Staff extends Person {
	void print() {
		System.out.println("I am a staff");
	}

	abstract void salary();

}
