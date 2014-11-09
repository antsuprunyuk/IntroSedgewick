package anton.alerty.arraysandloops;

public class DiceSimulation {

	public static void main(String[] args) {
		//theory part
		double[] dist = new double[13];
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				dist[i+j] += 1.0;
			}
		}
		
		
		
		//practical part
		double[] prob = new double[13];
		int counter = 0;
		boolean[] exact = new boolean[13];
		boolean isExact = false;
		//int N = 10000;
		while (!isExact) {
			int r = ((int) (Math.random() * 6)) + 1;
			int t = ((int) (Math.random() * 6)) + 1;
			prob[r + t] += 1.0;
			counter++;
			for (int i = 2; i <= 12; i++) {
				if (Math.abs((dist[i]*10000/36.0) - ((prob[i])*(10000.0/counter))) < 1) {
					exact[i] = true;
				}
			}
			//System.out.println(counter + "   "+ (dist[7]*1000) + "   " + (prob[7])*(1000.0/counter));
			isExact = true;
			for (int i = 2; i <= 12; i++) {
				isExact = isExact && exact[i];
			}
			if (!isExact) {
				for (int i = 2; i <= 12; i++) {
					exact[i] = false;
				}
			}
		}
		
		for (int k = 2; k <= 12; k++) {
			prob[k] /= counter;
		}
		
		//output results
		for (int k = 2; k <= 12; k++) {
			dist[k] /= 36.0;
			System.out.println(k + "  " +  dist[k] + "  " + prob[k]);
		}
		System.out.println(counter);
	}
}
