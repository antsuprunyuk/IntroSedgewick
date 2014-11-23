package anton.alerty.recursion;

public class RulerRecursion {

	public static void drawRuler(int n, double l, double x, double delta){
		if (n == 0) return;
		StdDraw.line(x, .5 + l, x, .5 - l);
		delta /= 2;
		StdDraw.show(100);
		drawRuler(n-1, l/1.5, x+delta, delta);
		drawRuler(n-1, l/1.5, x-delta, delta);
	}
	
	public static void main(String[] args) {
		StdDraw.setXscale(0, 500);
		drawRuler(7, 0.05, 250, 250);
	}

}
