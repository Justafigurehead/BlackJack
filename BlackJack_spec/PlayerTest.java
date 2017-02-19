// Test player can received a card from Dealer. Allow Player to look at said card. Create player to have an array of cards so it's easier to expand app and allow player to play 21 properly. 
// 
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
import BlackJack.*;

public class PlayerTest{

  private Player playerOne;
  private Card ace;

  @Before
  public void before(){
    playerOne = new Player("Mickie");
    ace = new Card("Ace", 1);
  }


// Test for Player
  @Test
  public void getPlayerName(){
    assertEquals("Mickie", playerOne.getPlayerName());
  }

  @Test
  public void checkPlayerHasEmptyHand(){
    assertEquals(0, playerOne.getHandSize());
  }

  @Test
  public void giveCardToPlayer(){
    playerOne.addToHand(ace);
    assertEquals(1, playerOne.getHandSize());
  }


// EXPANSION

  public void playerCanRefuseSecondRoundOfCardsFromDealer(){
  }
}