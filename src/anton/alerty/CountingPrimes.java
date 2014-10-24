package anton.alerty;

public class CountingPrimes {

	public static void main(String[] args) {
		final int N = 10000000;
		int count = 0;
		for (int i = 2; i < N; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i/j; j++) {
				if (i % j == 0) { 
					isPrime = false;
					break;
				}
			}
		if (isPrime) count++;
		//System.out.println(i + " isPrime? - " + isPrime);
			
		}
		System.out.println(count);
	}

}
