package anton.alerty.algorithms;

public class ThreeSum {

	public static void printAll(int[] a) {
		int N = a.length;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.printf("%5d %5d %5d\n", a[i], a[j], a[k]);
					}
				}
			}
		}
	}
	
	public static int count(int[] a) {
		int zeroTriples = 0;
		int N = a.length;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (a[i] + a[j] + a[k] == 0) zeroTriples++;
				}
			}
		}
		return zeroTriples;
	}
	public static int findClosest(int[] a, int x) {
	//	int zeroTriples = 0;
		int N = a.length;
		int closest = Integer.MAX_VALUE;
		int ai, aj, ak;
		ai = aj= ak = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (Math.abs(a[i] + a[j] + a[k] - x) < closest) {
						closest = Math.abs(a[i] + a[j] + a[k] - x);
						ai = a[i]; aj = a[j]; ak = a[k];
					}
				}
			}
		}
		System.out.printf("ai = %5d aj = %5d ak = %5d closestSumm = %5d",ai, aj, ak, closest);
		return closest;
	}
	
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdIn.readInt();
		}
		int zeroTriples = count(a);
		System.out.println(zeroTriples);
		printAll(a);
		findClosest(a, -15);
		
	}

}
