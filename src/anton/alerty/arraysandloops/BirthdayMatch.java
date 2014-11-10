package anton.alerty.arraysandloops;

public class BirthdayMatch {

	public static void main(String[] args) {
		final int DaysInYear = 365;
		final int T = 1000;
		int bigCounter = 0;
		double averagePeopleToCome = 0.0;
		int largestCounter = Integer.MIN_VALUE;
		int smallestCounter = Integer.MAX_VALUE;
		
		for (int i = 0; i < T; i++) {
			boolean[] datePresent = new boolean[DaysInYear];
			boolean gotMatch = false;
			int counter = 0;
			while (!gotMatch) {
				counter++;
				int r = (int)(Math.random()*DaysInYear);
				if (datePresent[r]) {
					gotMatch = true;
				} else {
					datePresent[r] = true;
				}
			}
			if (largestCounter < counter) { largestCounter = counter; }
			if (smallestCounter > counter) { smallestCounter = counter; }
			bigCounter += counter;
		}
		
		
		averagePeopleToCome = 1.0 * bigCounter / T;
		System.out.println(averagePeopleToCome + " " + smallestCounter + " " + largestCounter );
	}
}
