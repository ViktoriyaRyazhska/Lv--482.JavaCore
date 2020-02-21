package lab9;




public class Main {

	public static void main(String[] args) {
		try {

		      Plant pl = new Plant("rose", "blue",1);

		      System.out.println(pl);
		      Plant p2 = new Plant("eee", "blue", 5);
		      System.out.println(p2);      
		      Plant p3 = new Plant("orchid", "lue", 5);
		      System.out.println(p3);
		} catch (ColorException | TypeException e) {

		      System.err.println(e.getMessage() + "\n");

		      //e.printStackTrace();

		   }
	}

	

}
