package anton.alerty;

public class Kary {

	static void printDigit(int x) {
		switch (x) {
			case 10 : System.out.print("A"); break;
			case 11 : System.out.print("B"); break;
			case 12 : System.out.print("C"); break;
			case 13 : System.out.print("D"); break;
			case 14 : System.out.print("E"); break;
			case 15 : System.out.print("F"); break;
			default : System.out.print(x);
		}
	}
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		int t = 1;
		while (t <= i/k) {
			t *= k;
		}
		Integer m = i;
		m.toBinaryString(i);
		int w = 0;
		while (t > 0) {
			if (t <= i) {
				w =  (i / t);
				printDigit(w);
				i -= w * t;
			} else {
				System.out.print(0);
			}
			t /= k;
		}
		
	}

}
