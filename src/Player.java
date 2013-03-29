
public class Player {
	private Hand hand;
	private String name;
	private Team team;
	private Team oppTeam;
	
	public Player(String name){
		this.name = name;
		hand = new Hand(this);
	}
	
	public Hand getHand() {
		return hand;
	}
	public String getName() {
		return name;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team t){
		team = t;
	}
	public Team getOppTeam() {
		return oppTeam;
	}
	public void setOppTeam(Team t){
		oppTeam = t;
	}
	
}
