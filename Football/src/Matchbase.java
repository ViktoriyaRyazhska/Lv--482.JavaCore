import java.util.ArrayList;
import java.util.List;

public class Matchbase {
	
	private List<Match> matches = new ArrayList<Match>();
	
	public void addMatchToMatchbase(Match match){
		matches.add(match);
	}
	
	public void infoAboutAllGames(){
		for (int i = 0; i < matches.size(); i++) {
			boolean ans = matches.isEmpty(); 
	        if (ans == true) {
	            System.out.println("Not found matches."); 
	        }
	        else
		System.out.println(matches.get(i));
		}
	}
	
}
