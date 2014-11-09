package anton.alerty.arraysandloops;

public class CardsPokerDistribution {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
		                  "Jack", "Queen", "King", "Ace"
		                };
		//filling deck with cards
		String[] deck = new String[suit.length * rank.length];
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck[i * rank.length + j] = rank[j] + " of " + suit[i];
			}
		}
		//sorting deck
		for (int i = 0; i < deck.length; i++) {
			int r = (int) (Math.random()* (deck.length - i));
			String t = deck[i];
			deck[i] = deck[i+r];
			deck[i+r] = t;
		}
		
		//printing hand cards
		for (int i = 0; i < 5*N; i++) {
			System.out.print(deck[i] +  "   ");
			if (i % 5== 4) { System.out.println(); System.out.println(); }
		}
	}
}
