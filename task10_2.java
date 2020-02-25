
public class task10_2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread("Hello", 2000);
		Thread t2 = new MyThread("Peace", 3000);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is …");
	}

}
