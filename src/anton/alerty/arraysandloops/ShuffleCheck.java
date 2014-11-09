package anton.alerty.arraysandloops;

public class ShuffleCheck {

	public static void main(String[] args) {
		final int M = Integer.parseInt(args[0]);
		final int N = Integer.parseInt(args[1]);
		int[] a = new int[M];
		int[][] count = new int[M][M];
		
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < M; i++) {
				a[i] = i;
			}
			for(int i = 0; i < M; i++) {
				int r = i + (int)(Math.random()*(M-i));
				int temp = a[i];
				a[i] = a[r];
				a[r] = temp;
				count[a[i]][i]++;
			}
		}	
		
		//printing M*M matrix
		for(int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				double result = 1.0*count[i][j]/N;
				System.out.print(result +  " ");
			}
			System.out.println();
		}
	}

}
