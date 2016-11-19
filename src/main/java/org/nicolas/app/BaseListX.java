package org.nicolas.app;

public abstract class BaseListX {
	
	private int size = 0;
	
	public BaseListX(int input){
		this.size = input;
	}

	protected int getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}

}
