package BlackJack;
import java.util.ArrayList;
import java.util.Collections;


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

  public Card removeCard(int index){
   Card result = deckOfCards.remove(index);
   return result;
  }

  public void createDeckOfCards(){
    String[] names = {"Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Jack", "Queen", "King", "AcesHigh"};
    int[] values = new int[]{1, 2,3,4,5,6,7,8,9,10, 10, 10, 10, 11};
    int i = 0;
    while ( i < names.length) {
      deckOfCards.add(new Card(names[i], values[i]));
      i++;
    }
  }

  // How to print out an array to a String.
  // public String toString() { 
  //     return "Suit: " + this.suit + " / " + "Value: " + this.value;
  // }

  public void shuffleDeck(){
     Collections.shuffle(this.deckOfCards);
  }
}
