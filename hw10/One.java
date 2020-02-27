package hw10;

public class One extends Thread {
	
	@Override
	public void run( ) {
		Thread two = new Two("Thread number two", 2000);
		two.start();
	}
}
