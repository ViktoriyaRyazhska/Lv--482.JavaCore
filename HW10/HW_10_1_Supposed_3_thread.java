/*- Run three threads for 5 times. The third thread supposed to start 
 * after finishing working of the two previous threads.
 */

package hw_10;

public class HW_10_1_Supposed_3_thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new HW_10_1_Run_1();
		Thread t1 = new Thread(r1);
		Runnable r2 = new HW_10_1_Run_2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new HW_10_1_Run_3();
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		t3.start();

		System.out.println("Main DONE, the END ");
	}
}
