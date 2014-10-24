package anton.alerty;

public class KthRoot {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		final int k = Integer.parseInt(args[1]);
		final double EPSILON = 1e-15;
		double root = N;
		while (Math.abs(N - Math.pow(root, k)) > EPSILON ) {
			root = ((k - 1) * root + (N / Math.pow(root, k - 1)))/k;
		}
		System.out.println(root);
	}

}
