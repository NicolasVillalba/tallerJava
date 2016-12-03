package javalab.listas;

import java.util.Iterator;

class ListaEnlazadaIterator implements Iterator<Object> {
	private Nodo actual;
	
	public ListaEnlazadaIterator(Nodo primero){
		this.actual = primero;
	}
	@Override
	public boolean hasNext() {
		return this.actual != null;
	}
	@Override
	public Object next() {
		Object dato = this.actual.getDato();
		this.actual = this.actual.getProximo();
		return dato;
	}
	@Override
	public void remove() {}
}
