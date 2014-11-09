package anton.alerty.arraysandloops;

public class LongestPlateau {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		final int maxInt = 3;
		int longCount = 0;
		int count = 1;
		int location = 0;
		int loc = 0;
		boolean isCountCycle = false;
		int[] sequence = new int[N];
		//filling sequence with numbers
		for (int i = 0; i < N; i++) {
			sequence[i] = 1 + (int)(Math.random()*maxInt);
		}
		
		//searching the longest plateau
		for(int i = 1; i < N-1; i++) {
			if ((sequence[i] > sequence[i-1]) && !isCountCycle) {
				isCountCycle = true;
				loc = i;
			}
			if ((sequence[i] == sequence[i+1]) && isCountCycle) {
				count++;
			}
			if ((sequence[i] > sequence[i+1]) && isCountCycle) {
				isCountCycle = false;
				if(count > longCount) {
					longCount = count;
					location = loc;
				}
				count = 1;
			}
			if ((sequence[i] < sequence[i+1])&&(isCountCycle)) {
				isCountCycle = false;
				count = 1;
			}
		}
		
		//printing the sequence
		for (int i = 0; i < N; i++) {
			if (i % 50 == 0) System.out.println();
			if ((i == location) || (i == location + longCount)){
				System.out.print("  ");
			}	
			System.out.print(sequence[i] + " ");
		}
		System.out.println("\nLocation = " + location + ",  length = " + longCount);
	}
}
