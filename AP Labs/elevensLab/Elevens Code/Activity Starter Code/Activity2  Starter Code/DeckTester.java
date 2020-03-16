/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
      String[] suits = {"hearts", "diamonds", "spades"};
      int[] pointValues = {11, 12, 13};
      Deck d1 = new Deck(ranks, suits, pointValues);
      System.out.println("Deck 1: ");
      System.out.println("isEmpty(): " + d1.isEmpty());
      System.out.println("size(): " + d1.size());
      System.out.println("deal(): " + d1.deal());
      System.out.println("toString(): " + d1.toString());
      
      String[] ranks2 = {"2", "queen", "5"};
      String[] suits2 = {"spades", "diamonds", "spades"};
      int[] pointValues2 = {2, 12, 5};
      Deck d2 = new Deck(ranks2, suits2, pointValues2);
      System.out.println("Deck 2: ");
      System.out.println("isEmpty(): " + d2.isEmpty());
      System.out.println("size(): " + d2.size());
      System.out.println("deal(): " + d2.deal());
      System.out.println("toString(): " + d2.toString());
      
      String[] ranks3 = {"8", "ace", "9"};
      String[] suits3 = {"diamonds", "hearts", "spades"};
      int[] pointValues3 = {8, 1, 9};
      Deck d3 = new Deck(ranks3, suits3, pointValues3);
      System.out.println("Deck 3: ");
      System.out.println("isEmpty(): " + d3.isEmpty());
      System.out.println("size(): " + d3.size());
      System.out.println("deal(): " + d3.deal());
      System.out.println("toString(): " + d3.toString());
      
      
	}
}
