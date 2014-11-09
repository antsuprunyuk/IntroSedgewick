package anton.alerty.arraysandloops;

public class PepysProblem {

	public static void main(String[] args) {
		double probability1of6 = 0;
		double probability2of12 = 0;
		final int N = 1_000_000_0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < 6; j++) {
				if ((int)(Math.random()*6) == 1) {
					count1++;
					break;
				}
			}
			
			int c = 0;
			for (int j = 0; j < 12; j++) {
				if ((int)(Math.random()*6) == 1) {
					c++;
				}
				if (c == 2) {
					count2++;
					break;
				}
			}
		}
		
		probability1of6 = 100.0* count1 / N;
		probability2of12 = 100.0* count2 / N;
		System.out.println("probability of 1 of 6 times fair die turns: " + probability1of6);
		System.out.println("probability of 1+1 of 12 times fair die turns: " + probability2of12);

	}

}
