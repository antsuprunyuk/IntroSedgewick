package anton.alerty.arraysandloops;

public class ArrayCopy {
	public static void main(String[] args) {
		int a[][] = {  {2, 3, 4}, 
					   {1, 2, 3, 5, 4}, 
					   {5, 6, 8, 7}  };
		int b[][] = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			b[i] = new int[a[i].length];
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[i][j];
			}
		}
		for (int[] x : a) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
