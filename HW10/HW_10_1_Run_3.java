package hw_10;

public class HW_10_1_Run_3 implements Runnable {
	public void run() {

		System.out.println("Thread 3 START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {

			System.out.println("Thread 3 working");
		}
		System.out.println("Thread 3 FINISH");
	}
}