package javalab.representacion;

import java.awt.Graphics;
import java.util.LinkedList;

import javalab.figuras.Dibujable;
import javalab.figuras.Figura;
import javalab.figuras.Pizarra;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	private LinkedList<Dibujable> dibujables = new LinkedList<Dibujable>();
	
	public void agregar(Pizarra pizarra){
		if (pizarra != null){
			this.dibujables.add(pizarra);
			for(Figura fig : pizarra.figuras()){
				this.dibujables.add(fig);
			}
		}
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(Dibujable dib : dibujables){
			dib.dibujar(g);
		}
	}
}
