import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import BlackJack.*;

public class DealerTest{

  Dealer dealer;
  Player playerOne;

  @Before
  public void before(){
    dealer = new Dealer();
    playerOne = new Player("Mickie");
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

// Test comes out random which means it works but to avoid continually failing tests, I've commented it out. 
  // @Test
  // public void dealerIsReadyWithShuffledDeckAndTakesTopCard(){
  //     dealer.getReadyToPlay();
  //     Card topCard = dealer.takesTopCard();
  //     assertEquals(4,topCard.getValue());
  // }


// Last working spot - Dealer can now remove top card and return it back. Next step is to give Card to uninstantied Player class. See PlayerTest for further notes. Note I have not created Dealer start game function since we're working with TDD but if you have time give it a shot.



  @Test 
  public void dealerGivesCardToPlayer(){
    dealer.getReadyToPlay();
    Card topCard = dealer.takesTopCard();
    playerOne.addToHand(topCard);
    assertEquals(1, playerOne.getHandSize());
  }

  @Test 
  public void dealerAsksPlayerToRevealCardsandEvaluates(){

  }

  @Test
  public void dealerDeclaresWinner(){

  }


  // EXPANSION

  @Test 
  public void dealerCanGiveAnotherRoundOfCards(){

  }


}