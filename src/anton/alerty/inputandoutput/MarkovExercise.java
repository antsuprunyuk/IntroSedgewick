package anton.alerty.inputandoutput;

public class MarkovExercise {

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
			double[][] rank = new double[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					rank[i][j] = p[i][j];
				}	
			}
			
			
			for (int t = 0; t < T; t++) {
				double[][] newRank = new double[N][N];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						for (int k = 0; k < N; k++) {
							newRank[i][j] += rank[i][k] * p[k][j];
						}
					}
				}
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						rank[i][j] = newRank[i][j];
					}	
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					StdOut.printf("%5.2f", rank[i][j]);
				}
				StdOut.println();
			}
		}

	}
