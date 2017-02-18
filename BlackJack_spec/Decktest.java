import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import BlackJack.*;

public class DeckTest{

  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }


// Tests for Basic Deck


  @Test
  public void testEmptyDeckArray(){
    assertEquals(0, deck.getDeckSize());
  }
}