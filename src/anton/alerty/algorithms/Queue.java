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
	
	public void delete(int k) {
		Node tmp = first;
		if (k >= N) {
			System.out.println("there is no Kth element in the queue");
			return;
		}
		if (k == 0) {
			if (first == last) {
				first = null;
				last = null;
			} else	first = first.next;
		} else {
			for (int i = 1; i < k; i++) {
				tmp = tmp.next;
			}
			tmp.next = tmp.next.next;
			N--;
		}
	}
	
	public boolean find(Queue<Item> q, Item item) {
		
		for (Node temp = first; temp != null; temp = temp.next) {
			if ((temp.item).equals(item)) return true;
		}
		return false;
	}
	
	public void printReverse(Node ongoing) {
		if (ongoing == null) return;
		printReverse(ongoing.next);
		System.out.print(ongoing.item + " ");
	}
	
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				q.enqueue(item);
			} else System.out.println(q.dequeue());	
		}
		q.printReverse(q.first);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}