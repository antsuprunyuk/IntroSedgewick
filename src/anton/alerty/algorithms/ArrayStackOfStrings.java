package anton.alerty.algorithms;

public class ArrayStackOfStrings {

	private String[] a;
	private int N = 0;
	
	public ArrayStackOfStrings(int max) {
		a = new String[max];
	}
	
	public boolean isFull() {
		return (N == a.length - 1);
	}
	
	public boolean isEmpty() {
		return (N == 0);
	}
	
	public void push(String item) {
		a[N++] = item;
	}
	
	public String pop() {
		return a[--N];
	}
	
	public static void main(String[] args) {
		
		int max = Integer.parseInt(args[0]);
		ArrayStackOfStrings s = new ArrayStackOfStrings(max);
		while (!StdIn.isEmpty()) {
			if (s.isFull()) { 
				System.out.println("Stack is full");
			}
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			} else System.out.println(s.pop());	
		}
	}
}
