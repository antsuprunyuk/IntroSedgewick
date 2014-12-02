package anton.alerty.datatypes;

public class Rational {

	private final int num;
	private final int den;
	
	public Rational(int numerator, int denominator) {
		num = numerator;
		den = denominator;
	}
	
	public Rational plus(Rational b) {
		Rational tmp = new Rational(num * b.den + b.num * den, den * b.den);
		return tmp.makeSimple();
	}
	
	public Rational minus(Rational b) {
		Rational tmp = new Rational(num * b.den - b.num * den, den * b.den);
		return tmp.makeSimple();
	}
	
	public Rational times(Rational b) {
		Rational tmp = new Rational(num * b.num, den * b.den);
		return tmp.makeSimple();
	}
	
	public Rational over(Rational b) {
		Rational tmp = new Rational(num * b.den, den * b.num);
		return tmp.makeSimple();
	}
	
	public String toString() {
		return num + "/" + den;
	}

	public Rational makeSimple() {
		int gcd = gcd(num, den);
		return new Rational(num/gcd, den/gcd);
	}
	
	public static int gcd(int num, int den) {
		if (den == 0) return num;
		return gcd(den, num % den);
		
	}
	
	public static void main(String[] args) {
		Rational a = new Rational(8, 15);
		Rational b = new Rational(2, 30);
		System.out.println(a.plus(b));
	}

}
