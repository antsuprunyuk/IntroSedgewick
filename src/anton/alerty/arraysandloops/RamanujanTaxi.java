package anton.alerty.arraysandloops;

public class RamanujanTaxi {

	public static void main(String[] args) {
		final long Number = Integer.parseInt(args[0]);
		long N = 1111;
		while (N < 999888999888999L) {
metka:		for (long i = 1; i < N; i++) {
				if (i*i*i > N) break;
				for (long j = i; j < N; j++){
					if (i*i*i + j*j*j > N) break;
					if (i*i*i + j*j*j == N) {
						//System.out.println("found 2 cubs: " + i + " " + j);
						for (long k = i+1; k < N; k++) {
							if (k*k*k > N) break;
							for (long l = k; l < N; l++) {
								if (k*k*k + l*l*l > N) break;
								if (l*l*l + k*k*k == N) {
									System.out.println("N can be detemined as " + N + " = " +  i + "^3 + " + j + "^3  =  " + k + "^3 + " + l + "^3 ");
									break metka;
								}
							}
						}
					}
				}
				//if (i == (N-1)) System.out.println("I can`t find anything for " + N);
			}
		N++;
		if (N % 1000000 == 0) System.out.println("N = " + N);
		}
	}

}
