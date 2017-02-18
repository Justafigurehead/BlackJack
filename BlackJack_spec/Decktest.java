import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import BlackJack.*;

public class DeckTest{

  Deck deck;
  Card queen;

  @Before
  public void before(){
    deck = new Deck();
    queen = new Card("Queen", 10);
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

  // @Test 
  // public void testCanAddMultipleCardsToDeck(){

  // }

  // @Test 
  // public void testIfDeckIsShuffled(){

  // }


}