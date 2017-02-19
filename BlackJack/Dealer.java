package BlackJack;

import java.util.ArrayList;

public class Dealer{

  private Deck deck;

  public Dealer(){
    this.deck = new Deck();
  }

  public Deck getDeck(){
    return this.deck;
  }

  public void getReadyToPlay(){
    this.deck = new Deck();
    deck.createDeckOfCards();
    deck.shuffleDeck();
  }

  public Card takesTopCard(){
   Card topCard = deck.removeCard(0);
    return topCard;
  }

}