package org.nicolas.app;

public interface List extends Iterable<Object>{
	int size();
	boolean add(Object e);
	Object get(int k);
	Object remove(Object e);
	boolean insert(int pos, Object e);
}
