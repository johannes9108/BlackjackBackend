package blackjackBackend.application.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import blackjackBackend.application.model.Card;
import blackjackBackend.application.model.Player;
import blackjackBackend.application.model.Rank;
import blackjackBackend.application.model.Suit;

@Service
@SessionScope
public class BlackJackService implements BusinessLogic {
	
	private Set<Card> deckOfCards;
	private Player dealer;
	private List<Player> players;
	
	public Set<Card> generateShuffledDeck(){
		Set<Rank> rankSet = new HashSet<Rank>();
		Set<Suit> suitSet = new HashSet<Suit>();
		for (Suit suit : Suit.values()) {
			suitSet.add(suit);
		}
		for (Rank rank : Rank.values()) {
			rankSet.add(rank);
		}
		Set<Card> cards = new HashSet<Card>();
		for (Suit suit : suitSet) {
			for (Rank rank : rankSet) {
				cards.add(new Card(suit, rank));
			}
		}
		return cards;
	}
	
	
	public BlackJackService() {
		dealer = new Player("Casino");
		players = new ArrayList<Player>();
		players.add(new Player("Johannes"));
	}
	
	@PostConstruct
	void init() {
		deckOfCards = generateShuffledDeck();
		dealInitCards();
	}
	

	@Override
	public void dealInitCards() {
		Optional<Card> card = Optional.empty();
		for (Player player : players) {
			
			for(int i=0;i<2;i++) {
				card = deckOfCards.stream().findAny();
				player.receiveCard(card.get());
				deckOfCards.remove(card.get());
			}
			
		}
		card = deckOfCards.stream().findAny();
		card.get().setVisible(true);
		dealer.receiveCard(card.get());
		deckOfCards.remove(card.get());
		card = deckOfCards.stream().findAny();
		dealer.receiveCard(card.get());
		deckOfCards.remove(card.get());
		
		
	}

	@Override
	public void handlePlayerRequests() {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		for (Player player: players) {
			stringBuilder.append(player.getName() + ":" + player.getHand());
		}
		
		stringBuilder.append(dealer.getName() + ":" + dealer.getHand());
		
		stringBuilder.append("Remaining cards: " + deckOfCards);
		
		return stringBuilder.toString();
	}
	
	

}
