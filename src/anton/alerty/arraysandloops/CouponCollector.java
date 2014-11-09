package anton.alerty.arraysandloops;

public class CouponCollector {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		boolean[] isFound = new boolean[N];
		int cardCount = 0, valCount = 0;
//for N=6		System.out.println("   0  1  2  3  4  5 ");
		while (valCount < N) {
			int t = (int)(Math.random()*(N));
			cardCount++;
/*			
			//display trace
			if (t >= 10) {
				System.out.print(t + " ");
			} else {
				System.out.print(t + "  ");
			}
			for (int i = 0; i < N; i++) {
				if ((i == t)&&(!isFound[t])) {
					System.out.print("T  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
			//
*/			
			if (!isFound[t]) {
				isFound[t] = true;
				valCount++;
			}
		}
		System.out.println("N = " + N + " :  AttemptCount = " + cardCount);
	}
}
