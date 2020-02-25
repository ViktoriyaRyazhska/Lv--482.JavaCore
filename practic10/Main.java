package practic10;

public class Main {
//	public static void main(String[] args) throws InterruptedException {
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("I study java");
//			Thread.sleep(1000);
		
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread("hello", 1500);
	      Thread t2 = new MyThread("java", 5350);
	      t1.start();
	      t2.start();
	       t1.join();
	       t2.join();
	      System.out.println("Name");

//				for (int i = 0; i < 5; i++) {
//				System.out.println("I study java");
//				Thread.sleep(1000);
//	
//
//}
	}
}