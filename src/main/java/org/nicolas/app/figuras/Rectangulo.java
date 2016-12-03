package javalab.figuras;

public class Rectangulo extends Figura {
	private int ancho, alto;
	
	public Rectangulo(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public double area() {
		return this.alto*this.ancho;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
}
