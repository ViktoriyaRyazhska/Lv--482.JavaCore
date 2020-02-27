package hw10;

public class Two extends Thread{
	private String a;
	private int pause;

	   public Two(String a, int pause) {
	      this.a = a;
	      this.pause = pause;
	   }
	   
	   @Override
	   public void run() {
		   for (int i = 0; i < 3; i++) {
		       try { sleep(pause); 
		         } catch (InterruptedException e) {}
		         System.out.println(a);
		         
		}
		  Thread three = new Three("Thread number three", 1500);  
	      three.start();  
	      }
}
