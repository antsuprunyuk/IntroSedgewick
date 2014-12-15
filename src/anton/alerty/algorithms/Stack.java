package anton.alerty.algorithms;

public class Stack<Item> {

	private Node first;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	public Item peek() {
		return first.item;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			} else System.out.println(s.pop());	
		}
	}
}
