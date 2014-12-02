package anton.alerty.datatypes;

public class CompareAll {

	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int N = StdIn.readInt();
		System.out.println(N);
		Document[] a = new Document[N];
		for (int i = 0; i < N; i++) {
			a[i] = new Document(StdIn.readString(), k, d);
			System.out.println(i);
		}
		StdOut.print("  q  ");
		for (int j = 0; j < N; j++) {
			StdOut.printf("    %.4s", a[j].name());
		}
		StdOut.println();
		for (int i = 0; i < N; i++) {
			StdOut.printf("    %.4s", a[i].name());
			for (int j = 0; j < N; j++) {
				StdOut.printf("%8.2f", a[i].simTo(a[j]));
			}
			System.out.println();
		}
	}

}
