package practic10;
public class MyThread extends Thread {
   private String number;
   private int pause;

   public MyThread(String number, int pause) {
      this.number = number;
      this.pause = pause;
   }
public void run() {
      for (int i = 0; i < 5; i++) {
         try { sleep(pause); } catch (InterruptedException e) {}
         System.out.println("Thread " + number);
      }
}  }
