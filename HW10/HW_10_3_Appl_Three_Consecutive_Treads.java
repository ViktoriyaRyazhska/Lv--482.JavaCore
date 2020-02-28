package hw_10;

public class HW_10_3_Appl_Three_Consecutive_Treads {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new HW_10_3_Run_One();
		Thread t1 = new Thread(r1);

		t1.start();

		System.out.println("Main DONE");
	}
}
