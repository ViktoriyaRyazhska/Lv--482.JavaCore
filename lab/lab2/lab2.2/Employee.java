
public class Employee {
	private String name;
	private double rate;
	private int hours;
	
	private static int totalsum=0;
	
	Employee(){
	}
	
	Employee(String name, int rate){
		this.name=name;
		this.rate=rate;
	}
	
	Employee(String name, int rate, int hours){
		this.name=name;
		this.rate=rate;
		this.hours=hours;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getRate() {
		return (int) this.rate;
	}
	
	public int gerHours() {
		return this.hours;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRate(int rate) {
		
		this.rate=rate;
	}
	
	public void setHour(int hours) {
		this.hours=hours;
	}
	
	public void getSalary() {
		
		rate= this.rate*this.hours;
		totalsum=(int) (totalsum+rate);
		
	}
	
	public void changeRate(int rate) {
		this.rate = 0;
		this.rate=rate;
		totalsum=this.getRate();
		
	}
	
	public void getBonuses() {
		this.rate=this.rate+this.rate*0.1;
		totalsum=(int) (totalsum+rate);
	}
	
	public static double totalSalary() {
		
		return totalsum;
		
	}
	
	public String toString() {
		return "name " +  name + "\n" + "rate " + rate + "\n";
	}
	
	
}
