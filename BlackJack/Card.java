package BlackJack;

public class Card{

  int cardValue;

  public Card(int cardValue){
    this.cardValue = cardValue;
  }

  public int getValue(){
    return this.cardValue;
  }

  public void setValue(int newValue){
    this.cardValue = newValue;
  }
}