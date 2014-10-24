package anton.alerty;

public class CheckerBoard {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		final String oddPattern = "* ";
		final String evenPattern = " *";
		String str = "";

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i % 2 == 0) {
					System.out.print(oddPattern);
				} else {
					System.out.print(evenPattern);
				}
			}
			System.out.println();
		}
	}
}
