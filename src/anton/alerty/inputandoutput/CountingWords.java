package anton.alerty.inputandoutput;

public class CountingWords {

	public static void main(String[] args) {
		
		String[] word = new String[10];
		int i1[] = new int[10];
		int i2[] = new int[10];
		int k = 0;
		while(!StdIn.isEmpty()) {
			word[k] = StdIn.readString();
			i1[k] = StdIn.readInt();
			i2[k] = StdIn.readInt();
			k++;
		}
		for (int i = 0; i < k; i++) {
			double d = 1.0*i1[i]/i2[i];
			StdOut.printf("%10s %5d %7.3f", word[i], i1[i], d);
			StdOut.println();
		}
		//StdOut.println(count);
	}

}
