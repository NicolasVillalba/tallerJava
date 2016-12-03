package javalab.listas;

import java.util.Iterator;

public class ListaEnlazada implements Lista {
	private Nodo primero, ultimo;
	private int size;

	@Override
	public Lista add(Object dato) {
		Nodo nuevo = new Nodo(dato);
		if (this.primero == null){
			this.primero = nuevo;
		}else{
			this.ultimo.setProximo(nuevo);
		}
		this.ultimo = nuevo;
		this.size++;
		return this;
	}

	@Override
	public Object item(int idx) {
		int c = 0;
		for (Object o : this){
			if (c++ == idx) return o;
		}
		throw new RuntimeException("Item fuera de rango: "+idx);
	}
	@Override
	public int size() {
		return this.size;
	}
	@Override
	public Object remove(int idx) {
		Nodo anterior = null, actual = this.primero;
		int c = 0;
		while(actual != null){
			if (c++ == idx){
				if (actual == primero){
					this.primero = actual.getProximo();
				}else{
					anterior.setProximo(actual.getProximo());
				}
				if (actual == this.ultimo){
					this.ultimo = anterior;
				}
				return actual.getDato();
			}
			anterior = actual;
			actual = actual.getProximo();
		}
		return null;
	}
	@Override
	public Iterator<Object> iterator() {
		return new ListaEnlazadaIterator(this.primero);
	}
}
