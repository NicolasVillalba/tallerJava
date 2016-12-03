package javalab.listas;

class Nodo {
	private Object dato;
	private Nodo proximo;
	
	public Nodo(Object dato) {
		this.setDato(dato);
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public Nodo getProximo() {
		return proximo;
	}
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
}
