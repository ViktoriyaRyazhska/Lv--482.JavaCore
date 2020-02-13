
public class Student extends Person {
	
	final String TYPE_PERSON = "Student";
	
	public Student() {
		System.out.println(this.TYPE_PERSON + " was created.");
	}

	public void print() {
		 System.out.println("I am a student.");
	 }
}
