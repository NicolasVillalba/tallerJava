package org.nicolas.app;

class Node {
	
	private Object val;
	private Node next;
	
	public Node() {
	}
	
	public Node(Object val) {
		super();
		this.val = val;
	}

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return String.valueOf(val);
	}
	
	
	
	
}
