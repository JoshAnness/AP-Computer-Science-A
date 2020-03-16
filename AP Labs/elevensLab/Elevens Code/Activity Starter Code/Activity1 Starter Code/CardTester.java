/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("2", "Spades", 2);
      Card c2 = new Card("5", "Hearts", 5);
      Card c3 = new Card("Ace", "Diamonds", 1);
      
      System.out.println("c1 suit: " + c1.suit() + ", c1 rank: " + c1.rank() + ", c1 point value: " + c1.pointValue());
      System.out.println(c1.toString());
      System.out.println();
      System.out.println("c2 suit: " + c2.suit() + ", c2 rank: " + c2.rank() + ", c2 point value: " + c2.pointValue());
      System.out.println(c2.toString());
      System.out.println();
      System.out.println("c3 suit: " + c3.suit() + ", c3 rank: " + c3.rank() + ", c3 point value: " + c3.pointValue());
      System.out.println(c3.toString());
      System.out.println();
      System.out.println("c1 matches c2: " + c1.matches(c2));
      System.out.println("c2 matches c3: " + c2.matches(c3));
      
	}
}
