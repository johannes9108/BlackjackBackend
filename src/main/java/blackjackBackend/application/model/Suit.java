package blackjackBackend.application.model;

public enum Suit {

	CLUBS(1), DIAMONDS(2), SPADES(3), HEARTS(4);
	
	
	public int getValue() {
		return value;
	}

	private int value;

	private Suit(int val) {
		this.value = val;
	}
	
}
