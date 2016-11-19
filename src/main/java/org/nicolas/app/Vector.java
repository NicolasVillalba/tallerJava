package org.nicolas.app;

import java.util.Iterator;

public class Vector extends BaseList implements List{
	
	private static final int DEFAUL_CAP = 10;
	private Object[] buff;
	
	public Vector(int input) {
		super(input);
		buff = new Object[DEFAUL_CAP];
		
	}

	@Override
	public int size() {
		return super.getSize();
	}

	@Override
	public boolean add(Object e) {
		if(buff[buff.length - 1] != null ){
			grow();
		}
		if(size() == 0){
			buff[0] = e;
		}else {
			buff[size() + 1] = e;
		}
		return true;
	}

	@Override
	public Object get(int k) {
		if (k >= size() || k < 0) {
            throw new IndexOutOfBoundsException("Index: " + k + ", Size " + k );
		}
		return buff[k];
	}

	@Override
	public Object remove(Object e) {
		Object r = null;
		int i = 0;
		for (i = 0; i < buff.length; i++) {
			if (buff[i] ==  e) {
				r = buff[i];
				buff[i] = null;
			}
		}
		
		shiftBuffPositions(i);
		
		return r;
	}

	public void grow() {
		Object[] grather = new Object[buff.length * 3];
		for(int i = 0; i < buff.length; i++){
			buff[i] = grather[i];
		}
		buff = grather;
	}
	
	private void shiftBuffPositions(int pos){
		int path = buff.length - 1 - pos;
		for (int k = pos; k < path; k++) {
			buff[k] = buff[k + 1];
		}
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(int pos, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

}
