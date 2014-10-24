package anton.alerty;

public class RelativelyPrime {

	public static void main(String[] args) {
		System.out.println(" 123456789");
		for (int i = 1; i < 10; i++) {
			System.out.print(i+ " ");
			for (int j = 1; j < 10; j++) {
				int x = i;
				int y = j;
				if (y > x) {
					int t = x;
					x = y;
					y = t;
				}
				while (y > 0) {
				/*
					if ((x == 1) || (y == 1)) {
						System.out.print("*");
						break;
					}
				*/	
					if ((y != 1)&&(x % y == 0)) {
						System.out.print(y);
						break;
					} else {
						int t = y;
						y = x % y;
						x = t;
						if (y == 1) {
							System.out.print("*");
						}
					}
				}
			}
			System.out.println();
		}
	}

}
