package anton.alerty.algorithms;

import anton.alerty.functionsandmodules.Newton;

public class Stopwatch {
	
	private long start;
	private long memory;
	
	public Stopwatch() {
		start = System.currentTimeMillis();
	}		
	
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}
	
	public void stop() {
		memory += System.currentTimeMillis() - start;
	}
	
	public void restart() {
		start = System.currentTimeMillis();
	}
	
	public double totalTime() {
		long now = System.currentTimeMillis();
		return (memory) /1000.0 ;
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
		swNewton.stop();
	
		System.out.println(totalNewton/totalMath);
		System.out.println(timeNewton/timeMath);

		
		swNewton.restart();
		 totalNewton = 0.0;
		for (int i = 0; i < N; i++) {
			totalNewton += Newton.sqrt(i);
		}
		swNewton.stop();
		timeNewton = swNewton.totalTime();
		
		System.out.println(totalNewton/totalMath);
		System.out.println(timeNewton/timeMath);
	}
}
