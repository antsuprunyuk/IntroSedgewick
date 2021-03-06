package anton.alerty.algorithms;

public class Gaussian {

	public static double phi(double x) {
		return Math.exp(-x*x/2) / Math.sqrt(Math.PI*2);
	}
	
	public static double phi(double x, double m, double s) {
		return phi((x-m)/s) / s;
	}
	
	
	public static double Phi(double z) {
		if (z < - 8.0) return 0;
		if (z > 8.0) return 1;
		double term = z;
		double sum = 0.0;
		for (int i = 3; sum != sum + term ; i += 2) {
			sum += term;
			term *= z*z/i;
		}
		return 0.5 + phi(z) * sum;
	}
	
	public static void main(String[] args) {
		double z = Double.parseDouble(args[0]);
		double mu = Double.parseDouble(args[1]);
		double sigma = Double.parseDouble(args[2]);
		System.out.printf("%.3f\n", Phi((z-mu)/sigma));
	}
}
