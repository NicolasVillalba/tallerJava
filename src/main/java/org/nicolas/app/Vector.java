package org.nicolas.app;

import java.util.Arrays;
import java.util.Iterator;

public class Vector implements List {

	private int size = 0;
	private static final int DEFAUL_CAP = 10;
	private Object[] buff;

	public Vector() {
		buff = new Object[DEFAUL_CAP];

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean add(Object e) {
		if (e == null) {
			return false;
		} else {
			check();
			buff[size++] = e;
			return true;
		}
	}

	@Override
	public Object get(int k) {
		if (k >= size() || k < 0) {
			throw new IndexOutOfBoundsException("Index: " + k + ", Size " + k);
		}
		return buff[k];
	}

	@Override
	public Object getLast() {
		return buff[size() - 1];
	}

	@Override
	public boolean remove(Object e) {
		if(e == null){
			return false;
		}
		for (int i = 0; i < size(); i++) {
			if (buff[i].equals(e)) {
				shiftBuffPosLeft(i);
				return true;
			}
		}
		return false;
	}

	private void grow() {
		Object[] grather = new Object[buff.length * 3];
		for (int i = 0; i < buff.length; i++) {
			grather[i] = buff[i];
		}
		buff = grather;
	}

	private void shiftBuffPosLeft(int pos) {
		int path = size() - 1 - pos;
		for (int k = pos; k < path; k++) {
			buff[k] = buff[k + 1];
		}
	}
	
	private void shiftBuffPosRight(int pos) {
		for (int i = size(); i > pos; i--) {
			buff[i] = buff[i - 1];
		}
	}

	@Override
	public Iterator<Object> iterator() {
		return new VectorIterator(buff);
	}

	@Override
	public boolean insert(int pos, Object e) {
		if (pos > size && pos < 0) {
			return false;
		}
		buff[pos] = e;
		return true;
	}

	@Override
	public void clear() {
		buff = new Object[DEFAUL_CAP];
	}

	@Override
	public int indexOf(Object e) {
		for (int i = 0; i < buff.length; i++) {
			if (buff[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean addAtFirst(Object e) {
		if (e == null) {
			return false;
		} else {
			check();
			shiftBuffPosRight(0);
			buff[0] = e;
			return true;
		}
	}

	private void check() {
		if (buff[buff.length - 1] != null) {
			grow();
		}
	}

	@Override
	public Object getFirst() {
		return buff[0];
	}

	@Override
	public String toString() {
		return "Vector [size=" + size + ", buff=" + Arrays.toString(buff) + "]";
	}
	
	

}
