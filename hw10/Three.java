package hw10;

public class Three extends Thread{
	private String a;
	private int pause;

	   public Three(String a, int pause) {
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
