package org.nicolas.app;

import java.util.Iterator;

class LinketListIterator implements Iterator<Object> {
	
	private Node list;
	
	public LinketListIterator(Node list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return list.getNext() != null;
	}

	@Override
	public Object next() {
		Node n = list.getNext();
		list = n;
		return n;
	}

}
