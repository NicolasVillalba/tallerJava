package javalab.representacion;

import java.awt.Color;

import javalab.figuras.Circulo;
import javalab.figuras.Pizarra;

public class TestVentana {
	public static void main(String[] args) {
		Pizarra pizarra = new Pizarra(200,200,50);
		pizarra.agregar(new Circulo(10));
		pizarra.agregar(new Circulo(10));
		pizarra.agregar(new Circulo(10));
		pizarra.agregar(new Circulo(10 , 40, 70));
		pizarra.agregar(new Circulo(30 , 70, 70, Color.MAGENTA));
		
		Panel panel = new Panel();
		panel.agregar(pizarra);
		Ventana v = new Ventana(panel);
		v.setVisible(true);
		System.out.println("fin");
	}
}