package anton.alerty.datatypes;

import anton.alerty.functionsandmodules.Newton;

public class Stopwatch {
	
	private final long start;
	
	public Stopwatch() {
		start = System.currentTimeMillis();
	}		
	
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}
	
	public static void main(String[] args) {
		int N = 1_000_000;
		
		double totalMath = 0.0;
		Stopwatch swMath = new Stopwatch();
		for (int i = 0; i < N; i++) {
			totalMath += Math.sqrt(i);
		}
		double timeMath = swMath.elapsedTime();
		
		double totalNewton = 0.0;
		Stopwatch swNewton = new Stopwatch();
		for (int i = 0; i < N; i++) {
			totalNewton += Newton.sqrt(i);
		}
		double timeNewton = swNewton.elapsedTime();
		
		System.out.println(totalNewton/totalMath);
		System.out.println(timeNewton/timeMath);
	}
}
