package hw_10;

public class HW_10_3_Run_One implements Runnable {

	public void run() {

		System.out.println("Thread 1 START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 1 working");
		}

		Runnable r2 = new HW_10_3_Run_Two();
		Thread t2 = new Thread(r2);
		t2.start();
		System.out.println("Thread 1 FINISH");
	}
}
