package org.nicolas.app;

import java.util.Iterator;

class VectorIterator implements Iterator<Object>{
	
	private int pos = 0;
	
	private Object[] buffer;

	public VectorIterator(Object[] buffer) {
		this.buffer = buffer;
	}

	@Override
	public boolean hasNext() {
		return pos != buffer.length - 1 ;
	}

	@Override
	public Object next() {
		return buffer[pos++];
	}

}
