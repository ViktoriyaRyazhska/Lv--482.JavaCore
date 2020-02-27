package hw10;

public class MyThread extends Thread{

	private String a;
	private int pause;

	   public MyThread(String a, int pause) {
	      this.a = a;
	      this.pause = pause;
	   }
	   
	   @Override
	   public void run() {
		   for (int i = 0; i < 5; i++) {
		       try { sleep(pause); 
		         } catch (InterruptedException e) {}
		         System.out.println(a);
		         
		}
	        
	      }
	   

}
