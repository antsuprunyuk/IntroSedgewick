package anton.alerty.datatypes;

public class Document {

	private final Vector profile;
	private final String id;
	
	public Document(String name, int k, int d) {
		id = name;
		String s = (new In(name)).readAll();
		int N = s.length();
		double[] freq = new double[d];
		for (int i = 0; i < N - k; i++) {
			int h = s.substring(i, i+k).hashCode();
			freq[h%d] += 1;
		}
		profile = (new Vector(freq)).direction();
	}
	
	public double simTo(Document doc) {
		return profile.dot(doc.profile);
	}
	
	public String name() {
		return id;
	}
	
	public static void main(String[] args) {
		String name = args[0];
		int k = Integer.parseInt(args[1]);
		int d = Integer.parseInt(args[2]);
		Document doc = new Document(name, k, d);
		System.out.println(doc.profile);
	}

}
