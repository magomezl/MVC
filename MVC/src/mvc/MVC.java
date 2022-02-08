package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MVC {

	public static void main(String[] args) {
		Modelo model = new Modelo();
		Vista view = new Vista();
		Controlador controler = new Controlador(model, view);
		controler.iniciar();
		view.setVisible(true);
	}
}
