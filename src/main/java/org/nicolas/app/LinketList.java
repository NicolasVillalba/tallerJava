package org.nicolas.app;

import java.util.Iterator;
import java.util.StringJoiner;

public class LinketList implements List{
	
	private int size = 0;
	private Node head = new Node();
	private Node tail = head;

	public LinketList() {
		
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean add(Object e) {
		if (e == null) {
			return false;
		}
		if(head.getVal() == null){
			head.setVal(e);
			size++;
			return true;
		}else {
			Node temp = new Node(e);
			tail.setNext(temp);
			tail = temp;
			size++;
			return true;
		}
	}
	
	private Node traversal(Node head){
		Node temp = head;
		while (temp != null) {
			temp = temp.getNext();
		}
		return temp;
	}

	@Override
	public Object get(int k) {
		if (k >= size() || k < 0) {
			throw new IndexOutOfBoundsException("Key doesn't exist");
		}
		Node temp = head;
		int j = 0;
		while (k != j) {
			temp = temp.getNext();
			j++;
		}
		return temp.getVal();
	}
	
	@Override
	public Object getLast() {
		return tail.getVal();
	}
	
	@Override
	public Object getFirst() {
		return head.getVal();
	}
	
	@Override
	public boolean remove(Object e) {
		Node temp = head;
		while (temp != null) {
			if(temp.getVal().equals(e)){
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public Iterator<Object> iterator() {
		return new LinketListIterator(head);
	}

	@Override
	public boolean insert(int k, Object e) {
		
		if (k >= size() || k < 0) {
			return false;
		}
		
		if (k == 0) {
			addAtFirst(e);
			return true;
		}
		
		Node temp = head;
		int j = 0; 
		k = k -1;
		while (k != j) {
			temp = temp.getNext();
			j++;
		}
		Node in = new Node(e);
		in.setNext(temp.getNext());
		temp.setNext(in);
		size++;
		return true;
	}

	@Override
	public void clear() {
		head = new Node();
		tail = head;
	}

	@Override
	public int indexOf(Object e) {
		Node temp = head;
		int k = 0;
		while (temp != null) {
			if(temp.getVal().equals(e)){
				return k;
			}
			k++;
			temp = temp.getNext();
		}
		return -1;
	}
	
	@Override
	public boolean addAtFirst(Object e) {
		if(e == null){
			return false;
		}
		Node temp = head;
		head = new Node(e);
		head.setNext(temp);
		size ++;
		return true;
	}
	
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		Node temp = head;
		while (temp != null) {
			sj.add(temp.getVal().toString());
			temp = temp.getNext();
		}
		return sj.toString();
	}
}
