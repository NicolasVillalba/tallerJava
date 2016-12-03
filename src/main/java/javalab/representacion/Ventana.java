package javalab.representacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements WindowListener{
	private JLabel lblEstado = new JLabel();
	
	public Ventana(Panel panel){
		this.setTitle("Pizarra");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLocation(0, 0);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.getContentPane().add(panel);
		this.getContentPane().add(lblEstado, BorderLayout.SOUTH);
		this.addWindowListener(this);
		this.setJMenuBar(this.crearBarra());
	}
	public JMenuBar crearBarra(){
		JMenuBar barra = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenuItem itmSalir = new JMenuItem("Salir");
		itmSalir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Ventana.this.eventoSalir();
			}
		});
		barra.add(mnuArchivo);
		mnuArchivo.add(itmSalir);
		return barra;
	}
	public void eventoSalir(){
		if (JOptionPane.showConfirmDialog(this, "Desea salir?",this.getTitle(),JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
			System.exit(0);
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		this.lblEstado.setText("windowActivated");
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		this.lblEstado.setText("windowClosed");
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		this.lblEstado.setText("windowClosing");
		System.out.println("windowClosing");		
		this.eventoSalir();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		this.lblEstado.setText("windowDeactivated");
		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		this.lblEstado.setText("windowDeiconified");
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		this.lblEstado.setText("windowIconified");
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		this.lblEstado.setText("windowOpened");
		System.out.println("windowOpened");
	}
}
