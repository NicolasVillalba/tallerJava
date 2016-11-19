package org.nicolas.app;

public abstract class BaseList {
	
	private int size = 0;
	
	public BaseList(int input){
		this.size = input;
	}

	protected int getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}

}
