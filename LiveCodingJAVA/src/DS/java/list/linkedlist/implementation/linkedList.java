package DS.java.list.linkedlist.implementation;

public class linkedList {

	private Node head;
	private Node tail;
	private int size =0;

	private class Node{
		
		public Object data;
		public Node next;
		
		public Node(Object input) {
			this.data= input;
			this.next=null;
		}
		public String toString() {
			return String.valueOf(this.data);
		} 
	}

}
