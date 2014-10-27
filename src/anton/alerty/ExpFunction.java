package anton.alerty;

public class ExpFunction {

	public static void main(String[] args) {

		double sum = 0;
		double x = 7;
		double power = 1;
		double fact = 1;
		double term = 1.0;
		for (int i = 1; sum != sum + term; i++) {
			sum += term;
			//power *= x;
			//fact *= i;
			term *= x/i;
		}
		double javaMath = Math.pow(Math.E, x);
		System.out.println(sum + "  " + javaMath);
		
		double sum2 = 0;
		term = 1.0;
		for (int i = 1; sum != sum + term; i++) {
			sum2 += term;
			term = 1.0;
			for (int j = 1; j <= i; j++) {
				term *= x/j;
			}
		}
		System.out.println(sum2 + "  " + javaMath);
	}

}
