import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

import BlackJack.*;

public class DealerTest{

  Dealer dealer;

  @Before
  public void before(){
    dealer = new Dealer();
  }

//  Dealer Tests

  @Test
  public void testAccessToDealerDeckAnditsanEmptyDeck(){
    Deck dealerDeck = dealer.getDeck();
    assertEquals(0,dealerDeck.getDeckSize());
  }

// Test passed but refactored so getReadyToPlay included shuffling the cards too. 
  // @Test
  // public void dealerHasAFullOrderedDeck(){
  //   dealer.getReadyToPlay();
  //   Deck fullDeck = dealer.getDeck();
  //   assertEquals(14, fullDeck.getDeckSize());
  //   Card jack = fullDeck.removeCard(10);
  //   assertEquals("Jack", jack.getName());
  // }


  @Test
  public void dealerIsReadyWithShuffledDeckAndTakesTopCard(){
      dealer.getReadyToPlay();
      Card topCard = dealer.takesTopCard();
      assertEquals(4,topCard.getValue());
  }

  // @Test 
  // public void dealerGivesCardToPlayer(){

  // }
}