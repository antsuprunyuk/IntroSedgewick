package anton.alerty.datatypes;

public class GeneFind {

	public static void main(String[] args) {
		String start = args[0];
		String stop = args[1];
		String genome = StdIn.readString();
		int beg = 0;
		for (int i = 0; i < genome.length()-2; i++) {
			if (start.equals(genome.substring(i, i + 3))) {
				beg = i;
			}
			if ((stop.equals(genome.substring(i, i + 3)))&&(beg != -1)&&((i - beg) % 3 == 0)) {
				System.out.println(genome.substring(beg+3, i));
				beg = -1;
			}
		}
	}

}
