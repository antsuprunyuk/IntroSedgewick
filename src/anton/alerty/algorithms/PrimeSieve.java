package anton.alerty.algorithms;

public class PrimeSieve {

	public final static byte[] transitB = {-128, 1, 2, 4, 8, 16, 32, 64};
	
	public static void set1(byte[] b, int x) {
		b[(x/8) ] = (byte) (b[(x/8) ] | transitB[x%8]);
	}
	public static void set0(byte[] b, int x) {
		b[(x/8)] = (byte) (b[(x/8)] & (~transitB[x%8]));
	}
	
	public static boolean contains(byte[] b, int x) {
		if ((b[(x/8)] & transitB[x%8]) == transitB[x%8]) return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		//int[] transit = {-128, 1, 2, 4, 8, 16, 32, 64};
		int N = Integer.parseInt(args[0]);
		byte[] b = new byte[(N/8) + 1];
		
		
		for (int i = 2; i < N; i++) {
			set1(b, i);
		}
		
		for (int i = 2; i <= N / i; i++) {
			if (contains(b, i)) {
				for (int j = i; j <= N / i; j++) {
					set0(b, i * j);
				}
			}
		}
		System.out.println("\n");
		
		int counter = 0;
		for (int i = 2; i < N + 1; i++) {
			if (contains(b, i)) {
				counter++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + counter);
	}
}

