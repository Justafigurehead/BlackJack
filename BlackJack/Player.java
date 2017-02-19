package BlackJack;

import java.util.ArrayList;

public class Player {
  
  private String name;
  private ArrayList<Card> hand;

  public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }


  public String getPlayerName(){
    return this.name;
  }

  public int getHandSize(){
    return this.hand.size();
  }

  public void addToHand(Card card){
    hand.add(card);
  }
}