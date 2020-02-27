package hw10;

public class task10_1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread("Lviv", 2000);
		Thread t2 = new MyThread("Kiyv", 3000);
		Thread t3 = new MyThread("Donetsk", 1000);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
	}

	}


