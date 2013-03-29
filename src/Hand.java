import java.util.*;

public class Hand {
	private List<Card> cards;
	private Player player;
	public Hand(Player p) {
		player = p;
		cards = new ArrayList<Card>();
	}
	
	//add c to list
	public void putCard(Card c){
		if(!cards.contains(c)){
			cards.add(c);
		}
	}
	
	//check if the list contains c
	public boolean checkCard(Card c){
		return cards.contains(c);
	}
	
	public Player getPlayer(){
		return player;
	}
	
	//remove c from list and return c
	public Card takeCard(Card c){
		if(cards.contains(c))
			return cards.remove(cards.indexOf(c));
		
		//tries to remove card not present. need to throw exception here. 
		return null;
	}
}
