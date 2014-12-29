package anton.alerty.algorithms;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

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
	
	@Override
	public Iterator<Item> iterator() {
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item>{

		Node current = first;
		
		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
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
