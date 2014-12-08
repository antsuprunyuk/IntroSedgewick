package anton.alerty.algorithms;

public class Merge {

	public static void sort(Comparable[] a) {
		sort(a, 0, a.length);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		int N = hi - lo;
		int mid = lo + N / 2;
		if (N <= 1) return;
		sort(a, lo, mid);
		sort(a, mid, hi);
		Comparable[] aux = new Comparable[N];
		int i = lo; int j = mid;
		for (int k = 0; k < N; k++) {
			if 		(i == mid) aux[k] = a[j++];
			else if (j == hi)   aux[k] = a[i++];
			else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
			else							   aux[k] = a[i++];
		}
		for (int k = 0; k < N; k++) {
			a[lo + k] = aux[k];
		}
	}
	
	public static void main(String[] args) {
		String[] a = StdIn.readAll().split("\\s+");
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
