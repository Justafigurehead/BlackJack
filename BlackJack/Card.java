package BlackJack;

public class Card{

  private String cardName;
  private int cardValue;

  public Card(String cardName, int cardValue){
    this.cardName = cardName;
    this.cardValue = cardValue;
  }

  public int getValue(){
    return this.cardValue;
  }

  public void setValue(int newValue){
    this.cardValue = newValue;
  }
}