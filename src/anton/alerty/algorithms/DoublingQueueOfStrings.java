package anton.alerty.algorithms;

public class DoublingQueueOfStrings {
	
	private String[] s = new String[1];
	private int N = 0;
	
	public boolean isEmpty() {
		return (N == 0);
	}
	
	public void enqueue(String str) {
		if (N == s.length) resize(s.length * 2);
		s[N++] = str;
	}
	
	public String dequeue() {
		String str = s[0];
		for(int i = 0; i < N - 1; i++) {
			s[i] = s[i+1];
		}
		N--;
		if (N == s.length/4 && N > 0) resize(s.length/2);
		return str;
	}
	
	
	public void resize(int max) {
		String[] temp = new String[max];
		for (int i = 0; i < N; i++) {
			temp[i] = s[i];
		}
		s = temp;
		
	}

	public static void main(String[] args) {
		
		 DoublingQueueOfStrings q = new  DoublingQueueOfStrings();
		 while (!StdIn.isEmpty()) {
			 q.enqueue(StdIn.readString());
		 }
		 while (!q.isEmpty()) {
			 System.out.print(q.dequeue()+ " ");
		 }
	}

}
