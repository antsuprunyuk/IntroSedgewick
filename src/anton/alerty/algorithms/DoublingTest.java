package anton.alerty.algorithms;

public class DoublingTest {

	public static double timeTrial(int N) {
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdRandom.uniform(200_000) - 100_000;
		}
		Stopwatch s = new Stopwatch();
		int cnt = ThreeSum.count(a);
		return s.elapsedTime();
	}
	public static void main(String[] args) {
		int [] test = new int[180_000_000];
		double prev = timeTrial(256);
		for (int N = 512; true; N += N) {
			double curr = timeTrial(N);
			StdOut.printf("%7d %4.2f %5.2f \n", N, curr / prev, curr);
			prev = curr;
		}
	}
}
