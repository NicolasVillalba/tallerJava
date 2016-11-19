package org.nicolas.app;

import java.util.Iterator;

public class LinketList extends BaseList implements List{	

	public LinketList(int input) {
		super(input);
		
	}

	@Override
	public int size() {
		return super.getSize();
	}

	@Override
	public boolean add(Object e) {
		// 
		return false;
	}

	@Override
	public Object get(int k) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object remove(Object e) {
		// TODO Auto-generated method stub
		return null;
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
