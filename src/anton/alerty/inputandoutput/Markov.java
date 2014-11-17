package anton.alerty.inputandoutput;

public class Markov {

	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		int N = StdIn.readInt();
		StdIn.readInt();
		
		//reading transition matrix
		double[][] p = new double[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				p[i][j] = StdIn.readDouble();
			}
		}
		
		double[] rank = new double[N];
		rank[0] = 1.0;
		for (int t = 0; t < T; t++) {
			double[] newRank = new double[N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					newRank[j] += rank[k]*p[k][j]; 
				}
			}
			for (int j = 0; j < N; j++) {
				rank[j] = newRank[j];
			}	
		}
		//drawing
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setXscale(-1, N);
		StdDraw.setYscale(0, 0.2);
		for (int i = 0; i < N; i++) {
			double[] x = {i, i, i + 0.5, i + 0.5};
			double[] y = {0, rank[i], rank[i], 0};
			StdDraw.filledPolygon(x, y);
		}
		
		
		for (int i = 0; i < N; i++) {
			StdOut.printf("%8.5f", rank[i]);
		}
		StdOut.println();
	}

}
