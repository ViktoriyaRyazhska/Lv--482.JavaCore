package hw_10;

public class HW_10_3_Run_Three implements Runnable {
	public void run() {

		System.out.println("Thread number Three START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number Three working");
		}
		System.out.println("Thread number Three FINISH");
		System.out.println("The END");
	}
}
