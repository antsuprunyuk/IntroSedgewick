package anton.alerty.datatypes;

/*************************************************************************
 *  Compilation:  javac Document.java
 *  Execution:    java Document < docs.txt
 *
 *  % java Document genomeA.txt 2 16
 *
 *ATAGATGCATAGCGCATAGC
 *************************************************************************/

public class DocumentBook {
    private final String id;        // file name or URL
    private final Vector profile;         // unit vector

    public DocumentBook(String name, int k, int d) {
        id = name;
        String doc = (new In(name)).readAll();
        int N = doc.length();
        double[] freq = new double[d];
        for (int i = 0; i < N-k; i++) {
            int h = doc.substring(i, i+k).hashCode();
            System.out.print(h%d+ "  ");
            freq[Math.abs(h % d)] += 1;
        }
        System.out.println();
        profile = (new Vector(freq)).direction();
    }

    public double simTo(DocumentBook other) {
        return profile.dot(other.profile);
    }

    public String name() {
        return id;
    }

    public static void main(String[] args) {
        String name = args[0];
        int k = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        DocumentBook doc = new DocumentBook(name, k, d);
        System.out.println(doc.profile);
        System.out.println("AT".hashCode());
        System.out.println("TG".hashCode());
    }
}
