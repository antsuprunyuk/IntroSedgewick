package anton.alerty;

public class Sine {

	public static void main(String[] args) {
		double sum = 0.0;
		double x = 32.923598775598299;
		x = x % (2 * Math.PI);
		System.out.println("x = " +x);
		double term = x;
		for (int n = 3; term != 0.0; n += 2) {
			sum += term;
			term *= (-1 * x * x) / (n * (n-1));  
		}
		System.out.println( "sin x = " + sum + "   with java Math = " + Math.sin(x));
	}

}
