package anton.alerty;

public class GamblerRuin {

	public static void main(String[] args) {
		final int stake = Integer.parseInt(args[0]);
		final int goal = Integer.parseInt(args[1]);
		final int T = Integer.parseInt(args[2]);
		
		int bets = 0;
		int wins = 0;
		for (int i = 0; i < T; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
				bets++;
			}
			if (cash == goal) {
				wins++;
			}
		}
		System.out.println(100*wins/T + "% wins");
		System.out.println("Average # bets " + bets/T);
	}
}
