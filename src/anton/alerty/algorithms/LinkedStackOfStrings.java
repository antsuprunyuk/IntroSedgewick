package anton.alerty.algorithms;

public class LinkedStackOfStrings {

	private Node first;
	
	private class Node {
		String item;
		Node next;
	}
	
	public boolean isEmpty() {
		return (first.next == null);
	}
	
	public void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	
	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public static void main(String[] args) {

		LinkedStackOfStrings s = new LinkedStackOfStrings();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			} else System.out.println(s.pop());	
		}
	}
}
