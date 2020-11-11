package blackjackBackend.application.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Player {
	
	private Long id;
	private String name;
	private List<Card> hand;
	public void receiveCard(Card card) {
		hand.add(card);
	}
	public Player(String name) {
		super();
		this.name = name;
		this.hand = new ArrayList<Card>();
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
