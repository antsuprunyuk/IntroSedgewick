package anton.alerty;

public class EulerConjucture {

	public static void main(String[] args) {
		long N = Long.parseLong(args[0]);
		long a5= 0, b5 = 0, c5 = 0, d5 = 0, e5 = 0;
metka:	for (long e = 1; e5 <= N; e++) {
			if (e % 1000 == 0) {System.out.println(e);}
			long sum = 0;
			e5 = e*e*e*e*e;
			for (long a = 1 ; sum < e5; a++) {
				a5 = a*a*a*a*a;
				sum = a5;
				if (sum > e5) break;
				for (long b = a + 1;  sum < e5; b++) {
					b5 = b*b*b*b*b;
					sum = b5 + a5;
					if (sum > e5) break;
					for (long c = b + 1; sum  < e5; c++) {
						c5 = c*c*c*c*c;
						sum = a5 + b5 + c5;
						if (sum > e5) break;
						for (long d = c + 1; sum <= e5; d++) {
							d5 = d*d*d*d*d;
							sum = a5 + b5 + c5 + d5;
							//System.out.println(e + " = " + a + " " + b + " " + c + " " + d);
							//if (sum > e5) break;
							if (e5 == sum) {
								System.out.println(e + " = " + a + " " + b + " " + c + " " + d);
								System.out.println(e5 + " = " + a5 + " " + b5 + " " + c5 + " " + d5);
								//break metka;
							}
						}
						sum -= d5;	
					}
					sum -= c5;	
				}
				sum -= b5;	
			}
			sum -= a5;	
		}
	}
}
