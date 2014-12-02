package anton.alerty.datatypes;

public class Complex {

	private double re;
	private double im;
	
	public Complex(double real, double imag) {
		re = real;
		im = imag;
	}
	
	public Complex plus(Complex b) {
		double real = re + b.re;
		double imag = im + b.im;
		return  new Complex(real, imag);
	}
	
	public Complex times(Complex b) {
		double real = re * b.re - im * b.im;
		double imag = im * b.re + re * b.im;
		return new Complex(real, imag);
	}
	
	double abs() {
		return Math.sqrt(re * re + im * im);
	}
	
	public double re() {
		return re;
	}
	
	public double im() {
		return im;
	}
	
	public String toString() {
		return re + " + " + im + "i";
	}

	public static void main(String[] args) {
		Complex z0 = new Complex(1.0, 1.0);
		Complex z = z0;
		z = z.times(z).plus(z0);
		z = z.times(z).plus(z0);
		System.out.println(z.im());
	}

}
