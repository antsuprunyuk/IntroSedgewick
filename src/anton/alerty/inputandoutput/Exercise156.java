package anton.alerty.inputandoutput;

public class Exercise156 {

	public static void main(String[] args) {
		if (StdIn.isEmpty()) {
			StdOut.println("No entries");
			return;
		}
		
		final int N = StdIn.readInt();
		int[] a = new int[N];
		int fullSumm = N;
		int partSumm = 0;
		for (int i = 1; i < N ; i++) {
			a[i] = StdIn.readInt();
			fullSumm += i;
			partSumm += a[i];
		}
		
		int missedNumber = fullSumm - partSumm;
		StdOut.println(missedNumber);
	}

}
