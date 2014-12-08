package anton.alerty.algorithms;

public class TwentyQuestions {

	public static int search(int lo, int hi) {
		if (hi - lo == 1) return lo;
		int mid = lo + (hi - lo) / 2;
		System.out.print("Less than " + mid + "? ");
		if (StdIn.readBoolean()) {
			return search(lo, mid);
		} else return search(mid, hi);
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int N = (int) Math.pow(2, n);
		StdOut.println("Think of a number between 0 and " + (N - 1));
		int v = search(0, N);
		System.out.println("Your number is " + v);
	}
}
