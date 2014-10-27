package anton.alerty;

public class GameSimulation {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int guess, fact, open;
		
		int countNotSwitch = 0;
		for (int i = 0; i < N; i++) {
			fact = (int) (3*Math.random()) + 1;
			guess = (int) (3*Math.random()) + 1;
			if (fact == guess) {
				countNotSwitch++;
			}
		}
		double probabilityNotSwitch = 100.0 * countNotSwitch / N;
		System.out.println("NotSwitch probability: " + probabilityNotSwitch);
		
		int countSwitch = 0;
		for (int i = 0; i < N; i++) {
			fact = (int) (3*Math.random()) + 1;
			guess = (int) (3*Math.random()) + 1;
			if (guess != fact) {
				guess = fact;
				countSwitch++;
			} else if (guess == fact) fact = guess;
		}
		double probabilitySwitch = 100.0 * countSwitch / N;
		System.out.println("Switch probability: " + probabilitySwitch);
	}

}
