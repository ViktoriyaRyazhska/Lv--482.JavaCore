package Practice6;

public class Cleaner extends Staff {
	
	final String TYPE_PERSON = "";
	
	@Override
	public void print() {
		//TYPE_PERSON = "Student";
		System.out.println("I am a Cleaner");
	}
	
	@Override
	public int salary() {
		return 102;
		
	}


}
