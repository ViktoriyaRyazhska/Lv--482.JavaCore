package hw_10;

public class HW_10_1_Run_2 implements Runnable {

	public void run() {
		System.out.println("Thread 2 START " + Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 2 working");
		}
		System.out.println("Thread 2 FINISH");

	}
}
