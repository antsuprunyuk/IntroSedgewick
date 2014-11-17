package anton.alerty.inputandoutput;

public class TransitionExercise {

	public static void main(String[] args) {
		double prob1 = Double.parseDouble(args[0]);
		double prob2 = Double.parseDouble(args[1]);
		int N = StdIn.readInt();
		int[][] counts = new int[N][N];
		int[] outDegree = new int[N];
		
		while (!StdIn.isEmpty()) { 
			int i = StdIn.readInt();
			int j = StdIn.readInt();
			if (counts[i][j] == 0 ) {	
				counts[i][j]++;
				outDegree[i]++;
			}
		}
		
		StdOut.println(N + " " + N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				double p = prob1*counts[i][j]/outDegree[i] + prob2/N;
				StdOut.printf("%8.5f", p);
			}
			System.out.println();
		}
	}
}
