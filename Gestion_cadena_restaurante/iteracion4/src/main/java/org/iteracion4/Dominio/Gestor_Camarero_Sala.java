package org.iteracion4.Dominio;

import java.util.ArrayList;

public class Gestor_Camarero_Sala {

	public void solicitar_cuenta() {
		ArrayList<String> bebidas =new ArrayList<>();
		bebidas = obtener_bebidas();
		ArrayList<String> comidas =new ArrayList<>();
		comidas = obtener_comidas();
		Cuenta cuenta= new Cuenta(1,bebidas, comidas);
	}
	private ArrayList<String> obtener_comidas() {
		// TODO Auto-generated method stub
		return null;
	}
	private ArrayList<String> obtener_bebidas() {
		// TODO Auto-generated method stub
		return null;
	}
	public void marcar_estado_mesa(String opcion) {
		Mesa mesa = new Mesa();
		switch (opcion) {
		case "Libre":
			mesa.setEstado(Estados.Libre);
			break;	
		case "Espera cuenta":
			mesa.setEstado(Estados.espera_cuenta);
			break;
		case "Pagando":
			mesa.setEstado(Estados.pagando);
			break;
		case "En preparacion":
			mesa.setEstado(Estados.preparacion);
			break;
		}
	}

}