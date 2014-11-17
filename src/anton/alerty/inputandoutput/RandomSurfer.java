package anton.alerty.inputandoutput;

public class RandomSurfer {

	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		int N = StdIn.readInt();
		StdIn.readInt();
		double[] freq = new double[N];
		double [][] p = new double[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				p[i][j] = StdIn.readDouble();
			}
		}
		
		int page = 0;
		for (int t = 0; t < T; t++) {
			double sum = 0;
			double rand = Math.random();
			for (int j = 0; j < N; j++) {
				sum += p[page][j];
				if (sum > rand) {
					page = j;
					break;
				}
			}
			freq[page]++;
			
			//visualisation
			StdDraw.clear();
			StdDraw.setXscale(-1, N);
			StdDraw.setYscale(0, t+1);
			StdDraw.setPenRadius(0.5/N);
			for (int i = 0; i < N; i++) {
					StdDraw.line(i, 0, i, freq[i]);
			}
			StdDraw.show(50);
		}
		
		for (int i = 0; i < N; i++) {
			freq[i] /= T;
			StdOut.printf("%8.5f", freq[i]);
		}
		StdOut.println();
	
	}
}


