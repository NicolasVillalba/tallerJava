package javalab.figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

public class Pizarra implements Dibujable{
	private final int PORCENTAJE_OCUPACION;
	private int base;
	private int altura;
	private LinkedList<Figura> figuras = new LinkedList<Figura>();
	
	public Pizarra(int base, int altura, int OCUPACION){
		this.PORCENTAJE_OCUPACION = OCUPACION;
		this.setAltura(altura);
		this.setBase(base);
	}
	public void agregar(Figura figura){
		if (figura!=null){
			if (this.ocupacionProyectada(figura)<=this.PORCENTAJE_OCUPACION){
				this.figuras.add(figura);
			}
		}
	}
	public Iterable<Figura> figuras(){ return figuras;	}
	public int ocupacionProyectada(Figura figura){
		return (int)(this.areaProyectada(figura) / this.areaTotal());
	}
	public double areaTotal(){ return this.base * this.altura;}
	public double areaOcupada(){
		double total = 0;
		for(Figura fig : figuras){
			total += fig.area();
		}
		return total;
	}
	public double areaProyectada(Figura figura){
		if (figura == null) return this.areaOcupada();
		return this.areaOcupada()+figura.area();
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		if (base < 1) throw new RuntimeException("No puede ser negativo");
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if (altura < 1) throw new RuntimeException("No puede ser negativo");
		this.altura = altura;
	}
	@Override
	public void dibujar(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, base, altura);
	}
}
