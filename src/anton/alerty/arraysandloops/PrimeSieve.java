package anton.alerty.arraysandloops;

public class PrimeSieve {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		boolean[] isPrime = new boolean[N+1];
		
		for (int i = 2; i < N; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2; i <= N / i; i++) {
			if (isPrime[i]) {
				for (int j = i; j <= N / i; j++) {
					isPrime[i * j] = false;
				}
			}
		}
		System.out.println("\n");
		
		int counter = 0;
		for (int i = 2; i < N + 1; i++) {
			if (isPrime[i]) {
				counter++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + counter);
	}

}
