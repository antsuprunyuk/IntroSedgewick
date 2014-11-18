package anton.alerty.functionsandmodules;

public class Coupon {
	
	public static int uniform(int N) {
		return (int)(Math.random() * N);
	}	
	
	public static int collect(int N) {
		boolean[] found = new boolean[N];
		int valCount = 0;
		int cardCount = 0;
		while (valCount < N) {
			int t = uniform(N);
			if (!found[t]) {
				valCount++;
				found[t] = true;
			}
			cardCount++;
		}
		return cardCount;
	}
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int count = collect(N);
		System.out.println(count);
	}

}
