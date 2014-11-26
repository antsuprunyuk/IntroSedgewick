package anton.alerty.datatypes;

public class Split {

	public static void main(String[] args) {
		String file = args[0];
		int N = Integer.parseInt(args[1]);
		String delimiter = ",";
		
		In in = new In(file + ".txt");
		Out[] out = new Out[N];
		for (int i = 0; i < N; i++) {
			out[i] = new Out(file + (i + 1) + ".txt");
		}
		
		while(!in.isEmpty()) {
			String s = in.readLine();
			String[] fields = s.split(delimiter);
			for (int i = 0; i < N; i++) {
				out[i].println(fields[i]);
			}
		}
		
	}

}
