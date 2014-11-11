package anton.alerty.inputandoutput;

public class TwentyQuestions {

	public static void main(String[] args) {
		int N = 1 + (int) (Math.random()*100);  //hidden value
		int m = 0;								//user`s guess
		StdOut.println("Try to guess a number between 1 and 100");
		while (m != N) {
			StdOut.print("So, your guess? ");
			m = StdIn.readInt();
			if (m == N) { StdOut.println("Yeaaar! You`ve guessed it. It`s "+ N);}
			if (m < N) { StdOut.println("Your number is too small");}
			if (m > N) { StdOut.println("Your number is too big");}
		}
	}
}
