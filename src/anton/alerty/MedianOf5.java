package anton.alerty;

public class MedianOf5 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		
		if (a > b) {int t = a; a = b; b = t;} // a < b
		if (c > d) {int t = c; c = d; d = t;} // c < d
		if (b > d) {int t = b; b = d; d = t; t = a; a = c; c = t;} // a < b < d     c < d
		char cCh = 'c';
		char dCh = 'd';
		//if e > b then c < e  else  c < d
		if (e > b) { 
			if (d > e) {int t = d; d = e; e = t; dCh += 1;}
		} else {
			if (a > e) {int t = e; e = d; d = b; b = a; a = t; dCh += 1;}
			if (a < e) {int t = d; d = b; b = e; e = t; dCh += 1;}
		}
		if (c < b) {
			if (a > c) {}
		}
		//System.out.println(a + " " + b + " " + c);
	}
}
