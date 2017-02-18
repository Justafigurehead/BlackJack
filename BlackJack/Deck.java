package BlackJack;
import java.util.ArrayList;



public class Deck{

  private ArrayList<Card> deckOfCards;

  public Deck(){
    this.deckOfCards = new ArrayList<Card>();    
  }


  // Methods for Deck

  public int getDeckSize(){
    return deckOfCards.size();
  }

  public void addToDeck(Card card){
    deckOfCards.add(card);
  }

  // public void shuffleDeck(){
  //   deckOfCards.shuffle();
  // }
}
