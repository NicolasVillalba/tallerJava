package javalab.figuras;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura implements Dibujable{
	private static int id_ref=0, x_ref=10, y_ref=10;
	private int id;
	private String etiqueta;
	private Punto ubicacion;
	private Color color;
	
	public Figura(){
		this.setId(++id_ref);
		x_ref += 10; y_ref += 10;
		this.setUbicacion(new Punto(x_ref, y_ref));
		this.setEtiqueta("Sin nombre");
		this.setColor(Color.white);
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void dibujar(Graphics g){
		g.setColor(this.color);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public Punto getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Punto ubicacion) {
		this.ubicacion = ubicacion;
	}
	public abstract double area();
	@Override
	public String toString() {
		return "Figura [id=" + id + ", etiqueta=" + etiqueta + ", ubicacion="
				+ ubicacion + "]";
	}
}
