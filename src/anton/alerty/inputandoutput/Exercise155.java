package anton.alerty.inputandoutput;

public class Exercise155 {

	public static void main(String[] args) {
		int N = StdIn.readInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdIn.readInt();
		}
		int count = 1, total = 0, number = 0;
		

		for (int i = 1; i < N; i++) {
			if (a[i-1] == a[i]) {
				count++; 
			} else if (count > 1) {
				if (total < count) {
					number = a[i-1];
					total = count; 
					}
				count = 1;
			}
		}
		System.out.println(total + " consecutive " + number + "s");
	}
}
