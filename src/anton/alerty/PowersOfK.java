package anton.alerty;

public class PowersOfK {

	public static void main(String[] args) {
		long K = Long.parseLong(args[0]);
		long k = K;
		int p = 1;
		while (k <= Long.MAX_VALUE/K) {
			System.out.println(K + "^" + p + " = " + k);
			k *= K;
			p++;
		}
	}
}