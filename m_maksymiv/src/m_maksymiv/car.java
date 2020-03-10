package m_maksymiv;

public class car {

	private static int counter;
	private int temp;
	private  int hour;
	private static int hourprice;
	private static int place;

	static {
		counter = 0;
		hourprice = 5;
		place = 9;
		
	}
	
	car() {
		this.temp = counter++;
	}

	public int getPlace() {
		return place;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getCounter() {
		return this.temp;
	}

	public void input() {

	}

	public void clear() {

	}

	public int countPrice() {
		return this.hourprice * this.hour;
	}

	@Override
	public String toString() {
		return "car [temp=" + temp + ", hour=" + hour + "]";
	}
}
