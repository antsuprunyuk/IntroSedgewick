package anton.alerty.algorithms;

public class MergeTest {

	public static double timeTrials(int T, int N) {
		double total = .0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < N; i++) {
				a[i] = Math.random();
			}
				Stopwatch watch = new Stopwatch();
				Merge.sort(a);
				total += watch.elapsedTime();
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		double prev = timeTrials(T,512);
		for (int N = 1024; true; N += N) {
			double curr = timeTrials(T, N);
			System.out.printf("%7d %4.2f\n", N, curr / prev);
			prev = curr;
		}
	}
}
