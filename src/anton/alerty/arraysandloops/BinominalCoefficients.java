package anton.alerty.arraysandloops;

public class BinominalCoefficients {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		double[][] bd = new double[N][];
		
		//making ragged array
		for (int i = 0; i < N; i++) {
			bd[i] = new double[i+2];
		}
		bd[1][1] = 1;
		for (int i = 2; i < N; i++) {
			for (int j = 1; j < (bd[i].length-1); j++) {
				bd[i][j] = (bd[i-1][j] + bd[i-1][j-1]) / 2;
			}
		}
		
		//printing
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < (bd[i].length-1); j++) {
				System.out.print(bd[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
