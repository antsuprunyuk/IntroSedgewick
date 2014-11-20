package anton.alerty.functionsandmodules;

public class BirthdayProblem {
	final static int TIMES = 10_000;

	public static double findAverageNumber(int T, int N) {
		double sum = 0;
		for (int i = 0; i < T; i++) {
			sum += findNumber(N);
		}
		return sum/T;
	}
	
	public static int findNumber(int N) {
		boolean[] datePresent = new boolean[N+1];
		int count = 0; 
		int rand = 0;
		for (int i = 0; i < N; i++) {
			count++;
			rand = uniformInteger(N);
			if (datePresent[rand]) {
				return count;
			} else {
				datePresent[rand] = true;
			}
		}
		return count;
	}
	
	public static int uniformInteger(int N) {
		return 1 + (int)(Math.random()*N);
	}
	
	public static void main(String[] args) {
		int N = 365;
		int t = 10;
		for (int i = 0; i < t; i++) {
			int number = findNumber(N);
			System.out.print(number + " ");
		}
		double average = findAverageNumber(TIMES, N); 
		System.out.println("\n" + average);
	}
	
}
