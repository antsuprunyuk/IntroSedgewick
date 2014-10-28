package anton.alerty;

public class EulerConjucture {

	public static void main(String[] args) {
		long N = Long.parseLong(args[0]);
		//long a5, b5, c5, d5, e5;
metka:	for (long e = 1; e*e*e*e*e <= N; e++) {
			//if (e % 10 == 0) System.out.println(e);
			long sum = 0;
			long e5 = e*e*e*e*e;
			for (long a = 1 ; a*a*a*a*a < e5; a++) {
				long a5 = a*a*a*a*a;
				sum = a5;
				if (sum > e5) break;
				for (long b = a + 1; b*b*b*b*b + sum < e5; b++) {
					long b5 = b*b*b*b*b;
					sum = b5 + a5;
					if (sum > e5) break;
					for (long c = b + 1; c*c*c*c*c + sum  < e5; c++) {
						long c5 = c*c*c*c*c;
						sum = a5 + b5 + c5;
						if (sum > e5) break;
						for (long d = c + 1; d*d*d*d*d + sum < e5; d++) {
							long d5 = d*d*d*d*d;
							sum = a5 + b5 + c5 + d5;
							if (sum > e5) break;
							if (e5 == sum) {
								System.out.println(e + " = " + a + " " + b + " " + c + " " + d);
								break metka;
							}
						}
					}
				}
			}
		}
	}
}
