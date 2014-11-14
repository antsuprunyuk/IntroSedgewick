package anton.alerty.inputandoutput;

public class TenPerLine {

	public static void main(String[] args) {
		if (StdIn.isEmpty()) {
			StdOut.println("No entries, prepare for quit");
			return;
		}
		int current = 0;
		for (int count = 0; count < 100; count++) {
			if (count % 10 == 0) {
				StdOut.println();
			}
			current = StdIn.readInt();
			StdOut.printf("%-5d", current);
		}
	}

}
