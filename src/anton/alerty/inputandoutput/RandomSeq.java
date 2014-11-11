package anton.alerty.inputandoutput;

public class RandomSeq {

	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		
		for (int i = 0; i < N; i++) {
			System.out.println(Math.random());
		}
	}

}
