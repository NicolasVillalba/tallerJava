package javalab.pruebas;

import javalab.listas.Lista;
import javalab.listas.ListaEnlazada;

public class TestLista {
	public static void main(String[] args) {
		Lista lista = new ListaEnlazada();
		lista.add("jose").add("maria").add("perez");
		for(Object o : lista){
			System.out.println(o);
		}
		System.out.println("*****************");
		int i = 3;
		System.out.println("Elimino el item nro: "+i+": "+lista.remove(i));
		for(Object o : lista){
			System.out.println(o);
		}
	}
}
