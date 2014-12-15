package anton.alerty.algorithms;

public class Queue<Item> {
	
	private Node first;
	private Node last;
	private int N;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		N++;
		if (isEmpty()) {
			first = last;
		} else oldlast.next = last;
	}
	
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}	
		N--;
		return item;
	}
	
	public int length() {
		return N;
	}
	
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				q.enqueue(item);
			} else System.out.println(q.dequeue());	
			System.out.println(q.length());
		}
	}
}