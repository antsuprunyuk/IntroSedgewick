package anton.alerty.inputandoutput;

public class RandomIntSeq {

	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		for (int i = 0; i < N; i++) {
			int random = (int)(Math.random()*M);
			System.out.println(random);
		}
	}

}
