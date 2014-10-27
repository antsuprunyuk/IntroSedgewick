package anton.alerty;

public class ExpFunction {

	public static void main(String[] args) {

		double sum = 1;
		double x = 7;
		long power = 1;
		long fact = 1;
		for (int i = 1; i < 20; i++) {
			power *= x;
			fact *= i;
			sum += 1.0* power / fact;
		}
		double javaMath = Math.pow(Math.E, x);
		System.out.println(sum + "  " + javaMath);
	}

}
