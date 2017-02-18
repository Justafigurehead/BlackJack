import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import BlackJack.*;

public class DeckTest{

  Deck deck;
  Card queen;
  Card ten;

  @Before
  public void before(){
    deck = new Deck();
    queen = new Card("Queen", 10);
    ten = new Card("Ten", 10);
  }


// Tests for Basic Deck


  @Test
  public void testEmptyDeckArray(){
    assertEquals(0, deck.getDeckSize());
  }

  @Test 
  public void testAddCardToDeck(){
    deck.addToDeck(queen);
    assertEquals(1, deck.getDeckSize());
  }

  @Test 
  public void testCanAddMultipleCardsToDeck(){
    deck.addToDeck(queen);
    deck.addToDeck(ten);
    assertEquals(2, deck.getDeckSize());
  }

  @Test 
  public void getCardFromOrderedDeck(){
    deck.addToDeck(ten);
    deck.removeCard(ten);
    assertEquals("Ten", ten.getName());   
  }

  @Test 
  public void makeMultipleCardsAndAddThemToArray(){
    deck.createDeckOfCards();
    assertEquals(14, deck.getDeckSize());
  }

  // @Test 
  // public void getAParticularCardFromParticularSpotInOrderedDeck(){
  //   deck.add(ten);
  //   deck.removeCard(9);
  //   assertEquals("ten", two.getName());   
  // }

  // @Test 
  // public void checkDeckIsInOrder(){
  //   assertEquals([], deck.getDeckArr());
  // }

  // @Test 
  // public void checkGeneratedCardsHaveProperValues(){

  //   deck.createDeckOfCards();
  //   two = 
  //   assertEquals(2, two.getValue());
  // }

  // @Test 
  // public void testIfDeckIsShuffled(){

  // }



}