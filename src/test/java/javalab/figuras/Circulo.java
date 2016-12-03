package javalab.figuras;

import java.awt.Graphics;

public class Circulo extends Figura {
	private int radio;

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}
	@Override
	public void dibujar(Graphics g){
		super.dibujar(g);
		int diametro = this.radio * 2;
		g.drawOval(this.getUbicacion().getX(), this.getUbicacion().getY(), 
				    diametro, diametro);
	}
	@Override
	public double area() {
		return Math.PI * this.radio * this.radio;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]-"+super.toString();
	}

}
