package anton.alerty;

public class SamplingWithoutReplacement {

	public static void main(String[] args) {
		final int M = Integer.parseInt(args[0]);
		final int N = Integer.parseInt(args[1]);
		int[] perm = new int[N];
		
		for (int j = 0; j < N; j++) {
			perm[j] = j;
		}
		
		for (int i = 0; i < M; i++) {
			for (int k = 0; k < N; k++) {
				System.out.print(perm[k] + " ");
			}
			
			int r = i + (int)(Math.random()*(N-i));
			int t = perm[i];
			perm[i] = perm[r];
			perm[r] = t;
System.out.println("         i, r =  " + i + " " + r);
		}
		for (int k = 0; k < N; k++) {
			System.out.print(perm[k] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < M; i++) {
			System.out.print(perm[i] + "  ");
		}
		System.out.println();
	}

}
