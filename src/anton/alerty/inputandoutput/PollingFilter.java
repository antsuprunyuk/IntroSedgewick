package anton.alerty.inputandoutput;

public class PollingFilter {

	public static void main(String[] args) {
		int N = StdIn.readInt();
		int M = Integer.parseInt(args[0]);
		int count = 0;
		String s[] = new String[N];
		while (!StdIn.isEmpty()) {
			s[count] = StdIn.readString();
			count++;
		}
		N = s.length;
		if (N < M) {
			StdOut.println("Too many people to poll (M too big). Try run program with smaller M");
			return;
		}
		for (int i = 0; i < M; i++) {
			int r = (int)(Math.random()*(N-i));
			String t = s[i];
			s[i] = s[r];
			s[r] = t;
		}
		System.out.println(M);
		for (int i = 0; i < M; i++) {
			System.out.println(s[i]);
		}
	}

}
