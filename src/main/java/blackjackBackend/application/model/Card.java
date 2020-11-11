package blackjackBackend.application.model;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Card {
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	private Suit suit;
	private Rank rank;
	private Boolean visible;
	
	
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
		visible = true;
	}
	
	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}

}
