package org.nicolas.app;


public interface List extends Iterable<Object>{
	
	/**
	 * 
	 * @return how many elements are in the list
	 */
	int size();
	
	/**
	 * add a new element to the list at the end
	 * @param e
	 */
	boolean add(Object e);
	
	/**
	 * add a new element to the list at the beginning
	 * @param it
	 * @return
	 */
	boolean addAtFirst(Object e);
	
	/**
	 * Remove all contents from the list. Reset the list
	 */
	void clear();
	
	/**
	 * 
	 * @param k
	 * @return
	 */
	Object get(int k);
	
	/**
	 * Return the index of the the given element, if exist
	 * @param e element to find
	 * @return the position of the element otherwise -1
	 */
	int indexOf(Object e);
	
	/**
	 * return the last element of the list
	 * @return
	 */
	Object getLast();
	
	/**
	 * return the first element of the list
	 * @return
	 */
	Object getFirst();
	
	/**
	 * Removes a given object
	 * @param e Object to be remove
	 * @return boolean
	 */
	boolean remove(Object e);
	
	/**
	 * 
	 * @param pos
	 * @param e
	 * @return
	 */
	boolean insert(int k, Object e);
	
}
