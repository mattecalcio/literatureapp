
public class Card {
	private Suit suit;
	private CardValue value;
	
	public Card(Suit s, CardValue v){
		suit = s;
		value = v;
	}
	
	public Suit getSuit() {
		return suit;
	}
	public CardValue getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object c){
	    if (c == null) 
	    	return false;
	    if (c == this) 
	    	return true;
	    if (!(c instanceof Card))
	    	return false;
	    Card otherCard = (Card)c;
	    return ((otherCard.getSuit() == this.getSuit()) && (otherCard.getValue() == this.getValue()));
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + "]";
	}
	
}
