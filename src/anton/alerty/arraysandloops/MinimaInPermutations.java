package anton.alerty.arraysandloops;

public class MinimaInPermutations {

	public static void main(String[] args) {
		final int M = Integer.parseInt(args[0]);
		final int N = Integer.parseInt(args[1]);
		int[][] a = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = j;
			}
		}
		
		//shuffling
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				int r = j + (int)(Math.random() * (N - j));
				int t = a[i][j];
				a[i][j] = a[i][r];
				a[i][r] = t;
			}
		}
		
		//printing
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				//System.out.print(a[i][j] + " ");
			}	
			System.out.println();
		}
		System.out.println();
		
		//finding left-to-right minima
		int counter[] = new int[M];
		int counterSumm = 0;
		for (int i = 0; i < M; i++) {
			int min = N;
			for (int j = 0; j < N; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					counter[i]++;
				}
			}	
		}
		for (int i = 0; i < M; i++) {
			//System.out.print(counter[i] + " ");
			counterSumm += counter[i];
		}	
		System.out.print("\naverage numbers of left-to-right minima : " + (1.0*counterSumm/M) );
	}

}
