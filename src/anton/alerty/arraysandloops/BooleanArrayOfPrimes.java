package anton.alerty.arraysandloops;

public class BooleanArrayOfPrimes {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		boolean[][] b = new boolean[N+1][N+1];

		//filling matrix with true
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				b[i][j] = true;
			}
		}

		//computing relative primes
		for (int i = 2; i <= N; i++) {
			if (b[i][i]) {
				for (int m = i; m <= N; m += i)
					for (int n = i; n <= N; n += i) {
						b[m][n] = false;
					}
			}
		}
		
		//printing array
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (b[i][j]) {
					System.out.print("* ");
				} else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
/*

* * * * * * * 
*   *   *   * 
* *   * *   * 
*   *   * * * 
* * * *   * * 
*     * *   * 
* * * * * *   

*/