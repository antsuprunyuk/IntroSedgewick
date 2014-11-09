package anton.alerty.arraysandloops;

public class Cosine {

	public static void main(String[] args) {
		double x = 0.534;
		x = x % (2*Math.PI);  // conversion to interval (-2pi +2pi)
		System.out.println("x = "+ x);
		double sum = 1.0;
		double term = 1.0;
		
		for (int n = 1; term != 0.0; n++) {
			term *= x / n;
			if (n % 4 == 2) sum -= term;
			if (n % 4 == 0) sum += term;
		}
		System.out.println("cos x = " + sum + "   java Math cos = " + Math.cos(x));
	}

}
