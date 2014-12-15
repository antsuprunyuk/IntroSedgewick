package anton.alerty.algorithms;

public class DoublingStackOfString {

	private String[] a = new String[1];
	private int N = 0;
	
	public boolean isEmpty() {
		return (N == 0);
	}
	
	public void push(String item) {
		if (N == a.length) { 
			resize(a.length * 2);
		}
		a[N++] = item;
	}
	
	public String pop() {
		String item = a[--N];
		a[N] = null;
		if ((N > 0)&&(N == a.length / 4)) { 
			resize(a.length/2);
		}
		return item;
	}
	
	public void resize(int max) {
		String[] newString = new String[max];
		for (int i = 0; i < N; i++) {
			newString[i] = a[i];
		}
		a = newString;
	}
	
	
	public static void main(String[] args) {
		DoublingStackOfString s = new DoublingStackOfString();  
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			} else System.out.println(s.pop());	
		}
	}

}
