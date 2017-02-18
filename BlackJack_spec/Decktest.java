import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
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

  // @Test 
  // public void getCardFromDeck(){
  //   deck.addToDeck(ten);
  //   deck.removeCard(ten);
  //   assertEquals("Ten", ten.getName());   
  // }

  @Test 
  public void makeMultipleCardsAndAddThemToArray(){
    deck.createDeckOfCards();
    assertEquals(14, deck.getDeckSize());
  }

  @Test 
  public void getAParticularCardFromParticularSpotInOrderedDeck(){
    deck.createDeckOfCards();
    Card ten = deck.removeCard(9);
    assertEquals("Ten", ten.getName());   
  }

  @Test 
  public void checkDeckIsInOrder(){
  deck.createDeckOfCards();
  Card ace = deck.removeCard(0);
  assertEquals("Ace", ace.getName()); 
  Card two = deck.removeCard(0);
  assertEquals("Two", two.getName());
  Card three = deck.removeCard(0);
  assertEquals("Three", three.getName());
  }

// Refactor tests by reducing it to printing out card name and value toString rather than two separate tests.

  @Test 
  public void checkGeneratedCardsHaveProperValues(){
    deck.createDeckOfCards();
    Card ace = deck.removeCard(0);
    assertEquals(1, ace.getValue()); 
    Card two = deck.removeCard(0);
    assertEquals(2, two.getValue());
    Card three = deck.removeCard(0);
    assertEquals(3, three.getValue());
  }


// Commented out because it fails due to random order but works! :) 
  @Test 
  public void testIfDeckIsShuffled(){
    deck.createDeckOfCards();
    deck.shuffleDeck();
    Card wild = deck.removeCard(0);
    assertEquals(1, wild.getValue());
  }



}