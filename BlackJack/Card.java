package BlackJack;

public class Card{

  private int cardValue;
  private String cardName;

  public Card(int cardValue){
    this.cardValue = cardValue;
    this.cardName = cardName;
  }

  public int getValue(){
    return this.cardValue;
  }

  public void setValue(int newValue){
    this.cardValue = newValue;
  }
}