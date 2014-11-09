package anton.alerty.arraysandloops;

public class ArrayTest {

	public static void main(String[] args) {
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] deck = new String[suit.length * rank.length];
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[i*suit.length + j] = rank[i] + " of " + suit[j];
			}
		}
		for (int k = 0; k < deck.length; k++) {
			System.out.println(deck[k]);
		}
	}
}
