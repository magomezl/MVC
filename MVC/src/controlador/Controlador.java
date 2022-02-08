package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
	private Modelo modelo;
	private Vista vista;
	
	/**
	 * Creamos el contructor, el controlador necesita de la vista y del modelo 
	 * e indicar quien va a gestionar los eventos que se produzcan sobre el botón de la vista 
	 * @param modelo
	 * @param vista
	 */
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		// Indicamos quien va a gestionar los eventos que se produzcan sobre el botón de la vista
		this.vista.btnSumar.addActionListener(this);
	}

	/**
	 * Método que para iniciar la vista. El controlador se encargará de iniciar la vista
	 */
	
	public void iniciar() {
		vista.setTitle("MVC Suma");
		// Posiciono la ventana en el centro de la pantalla
		vista.setLocationRelativeTo(null);
	}
	
	/**
	 * Acción que se llevará a cabo cuando se produzcan eventos. En este caso sobre el botón de la vista
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		modelo.setNum1(Integer.parseInt(vista.txt1.getText()));
		modelo.setNum2(Integer.parseInt(vista.txt2.getText()));
		vista.txtResultado.setText(String.valueOf(modelo.suma()));
	}

}
