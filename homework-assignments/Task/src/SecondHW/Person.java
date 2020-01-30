package SecondHW;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public void SetfirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void SetlastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setBirthyear(int birthYear) {
		this.birthYear=birthYear;
	}
	
	public String getFirstname() {
		return this.firstName;
	}
	
	public String getLastname() {
		return this.lastName;
	}
	
	public int getYears() {
		return this.birthYear;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	
	Person(){
		
	}
	
	Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void Input(String firstName,String lastName,int birthYear) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthYear=birthYear;
	}
	
	public void Output() {
		
		System.out.print("\n" + this.firstName + "\n" + this.lastName + "\n" + this.birthYear + "\n");
		
	}
	
	public int getAge(int birthDate) {
		int temp=2020;
		birthDate=temp-birthDate;
		return birthDate;
	}
	
	public void changeName(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String toString() {
		return firstName + lastName + birthYear;
	}
}
