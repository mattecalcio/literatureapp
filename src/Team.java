import java.util.*;

public class Team {
	//List of players on the team
	private List<Player> players;
	
	//Initialize the list that will hold the players
	public Team () {
		players = new ArrayList<Player>();
	}
	
	//Add player to the team
	public void addPlayer(Player p) {
		players.add(p);
	}
	
	//Remove player from team
	public void removePlayer(Player p){
		players.remove(p);
	}
	
	//Get the number of players on the team
	public int teamSize() {
		return players.size();
	}
	
	
}
