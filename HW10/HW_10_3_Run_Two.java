package hw_10;

public class HW_10_3_Run_Two implements Runnable {

	public void run() {
		System.out.println("Thread number Two START " + Thread.currentThread().getId());
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread Two working");
		}
		Runnable r3 = new HW_10_3_Run_Three();
		Thread t3 = new Thread(r3);
		t3.start();
		System.out.println("Thread Two FINISH");

	}
}
