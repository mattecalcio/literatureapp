import java.util.*;


public class Game {
	int score1; //team1 score
	int score2; //team2 score
	Team team1;
	Team team2;
	Player currTurn;
	
	public Game(){
		//init the game
		//set up deck
		List<Card> deck = new ArrayList<Card>();
		initDeck(deck);
		
		System.out.println(deck);
		System.out.println(deck.size());
	}
	
	
	
	//inserts 48 cards into the deck and does a shuffle
	public void initDeck(List<Card> deck){
		//Spades
		deck.add(new Card(Suit.Spade,CardValue.Two));
		deck.add(new Card(Suit.Spade,CardValue.Three));
		deck.add(new Card(Suit.Spade,CardValue.Four));
		deck.add(new Card(Suit.Spade,CardValue.Five));
		deck.add(new Card(Suit.Spade,CardValue.Six));
		deck.add(new Card(Suit.Spade,CardValue.Seven));
		deck.add(new Card(Suit.Spade,CardValue.Eight));
		deck.add(new Card(Suit.Spade,CardValue.Nine));
		deck.add(new Card(Suit.Spade,CardValue.Ten));
		deck.add(new Card(Suit.Spade,CardValue.Jack));
		deck.add(new Card(Suit.Spade,CardValue.Queen));
		deck.add(new Card(Suit.Spade,CardValue.King));
		
		//Hearts
		deck.add(new Card(Suit.Heart,CardValue.Two));
		deck.add(new Card(Suit.Heart,CardValue.Three));
		deck.add(new Card(Suit.Heart,CardValue.Four));
		deck.add(new Card(Suit.Heart,CardValue.Five));
		deck.add(new Card(Suit.Heart,CardValue.Six));
		deck.add(new Card(Suit.Heart,CardValue.Seven));
		deck.add(new Card(Suit.Heart,CardValue.Eight));
		deck.add(new Card(Suit.Heart,CardValue.Nine));
		deck.add(new Card(Suit.Heart,CardValue.Ten));
		deck.add(new Card(Suit.Heart,CardValue.Jack));
		deck.add(new Card(Suit.Heart,CardValue.Queen));
		deck.add(new Card(Suit.Heart,CardValue.King));
		
		//Clubs
		deck.add(new Card(Suit.Club,CardValue.Two));
		deck.add(new Card(Suit.Club,CardValue.Three));
		deck.add(new Card(Suit.Club,CardValue.Four));
		deck.add(new Card(Suit.Club,CardValue.Five));
		deck.add(new Card(Suit.Club,CardValue.Six));
		deck.add(new Card(Suit.Club,CardValue.Seven));
		deck.add(new Card(Suit.Club,CardValue.Eight));
		deck.add(new Card(Suit.Club,CardValue.Nine));
		deck.add(new Card(Suit.Club,CardValue.Ten));
		deck.add(new Card(Suit.Club,CardValue.Jack));
		deck.add(new Card(Suit.Club,CardValue.Queen));
		deck.add(new Card(Suit.Club,CardValue.King));
		
		//Diamonds
		deck.add(new Card(Suit.Diamond,CardValue.Two));
		deck.add(new Card(Suit.Diamond,CardValue.Three));
		deck.add(new Card(Suit.Diamond,CardValue.Four));
		deck.add(new Card(Suit.Diamond,CardValue.Five));
		deck.add(new Card(Suit.Diamond,CardValue.Six));
		deck.add(new Card(Suit.Diamond,CardValue.Seven));
		deck.add(new Card(Suit.Diamond,CardValue.Eight));
		deck.add(new Card(Suit.Diamond,CardValue.Nine));
		deck.add(new Card(Suit.Diamond,CardValue.Ten));
		deck.add(new Card(Suit.Diamond,CardValue.Jack));
		deck.add(new Card(Suit.Diamond,CardValue.Queen));
		deck.add(new Card(Suit.Diamond,CardValue.King));
		
		//shuffle
		long seed = System.nanoTime();
		Collections.shuffle(deck, new Random(seed));
	}
}
