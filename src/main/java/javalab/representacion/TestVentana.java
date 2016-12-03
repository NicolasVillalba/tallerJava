package javalab.representacion;

import java.awt.Color;

import javalab.figuras.Circulo;
import javalab.figuras.Figura;
import javalab.figuras.Pizarra;
import javalab.figuras.Punto;

public class TestVentana {
	public static void main(String[] args) throws InterruptedException {
		Pizarra pizarra = new Pizarra(200,200,50);
		pizarra.agregar(new Circulo(10));
		pizarra.agregar(new Circulo(10));
		pizarra.agregar(new Circulo(10));
		
		Panel panel = new Panel();
		panel.agregar(pizarra);
		Ventana v = new Ventana(panel);
		v.setVisible(true);
		Circulo cc = null;
		for(Figura c : pizarra.figuras()){
			if(c.getId() == 3){
				cc = (Circulo) c;
			}
		}
		int i = 0;
		while(cc.getUbicacion().getX() != pizarra.getBase()){
			cc.setUbicacion(new Punto(cc.getUbicacion().getX()+i, cc.getUbicacion().getX()));
			v.getContentPane().validate();
			v.getContentPane().repaint();
			Thread.sleep(100);
			i++;
		}
		System.out.println("fin");
	}
}