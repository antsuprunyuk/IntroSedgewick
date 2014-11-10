package anton.alerty.arraysandloops;

public class HadamardMatrix {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int n = N;
		while (n > 1) {
			if (n % 2 != 0) { 
				System.out.println(" N is not a power of 2");
				return;
			} else n /= 2;
		}
		
		boolean[][] b = new boolean[N][N];
		b[0][0] = true;
		for (n = 1; n < N; n += n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					b[i+n][j] = b[i][j];
					b[i][j+n] = b[i][j];
					b[i+n][j+n] = !b[i][j];
				}
			}
		}
/*		boolean[][] prev = new boolean[N][N]; 
		n = 1;
		prev[0][0] = true;
		
		while (n < N) {
			 n *= 2;
			 for (int i = 0; i < n; i++) {
				 for (int j = 0; j < n; j++) {
					 if ((i >= n/2) && (j >= n/2)) {
						 b[i][j] = !prev[i%(n/2)][j%(n/2)];
				 	 } else b[i][j] = prev[i%(n/2)][j%(n/2)];
				 }
			 }	 
			 prev = b;
		}
*/		
		 for (int i = 0; i < n; i++) {
			 for (int j = 0; j < n; j++) {
				 if (b[i][j]) {
					 System.out.print("T ");
				 } else System.out.print("F ");
			 }
			 System.out.println(""); 
		 }	 
		System.out.println("");
	}

}
