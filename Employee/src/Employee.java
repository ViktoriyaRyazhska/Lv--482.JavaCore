
public class Employee {
	
	private static int totalSum=0;


    private String name;
    private int rate;
    private int hours;
    public static int getTotalSum() {

        return totalSum;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum = totalSum-this.rate*hours;
        this.rate = rate;
        totalSum = totalSum+rate*hours;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum = totalSum-rate*this.hours;
        this.hours = hours;
        totalSum = totalSum+rate*this.hours;

    }



    public Employee() {

    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum+rate*hours;


    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
    }
    public int changeRate(int rate){
        return this.rate=rate;
    }
    public int getSalary() {
        return rate*hours;
    }
    public int getBonuses(){
        return (int) (getSalary()*1.1);
    }
    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;

    }

}

	
	

