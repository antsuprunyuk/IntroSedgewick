package anton.alerty.arraysandloops;

public class InversePermutation {

	public static void main(String[] args) {
		final int N = args.length;
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		
		for (int i = 0; i < N; i++) { 
			b[a[i]] = i;
		}
		//printing
		for (int i = 0; i < N; i++) { 
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) { 
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < N; i++) { 
			System.out.print(b[a[i]] + " ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) { 
			System.out.print(a[b[i]] + " ");
		}
	}

}
