package org.iteracion4.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestor_Camarero_Sala {

	public Cuenta solicitar_cuenta() {
		ArrayList<String> bebidas =new ArrayList<>();
		bebidas = obtener_bebidas();
		ArrayList<String> comidas =new ArrayList<>();
		comidas = obtener_comidas();
		Cuenta cuenta= new Cuenta(1,bebidas, comidas);
		
		return cuenta;
	}
	@SuppressWarnings("resource")
	private ArrayList<String> obtener_comidas() {
		Scanner sc = new Scanner(System.in);
		Mesa m = new Mesa();
		ArrayList<String> comidas=new ArrayList<String>();
		for (int i=0; i< m.getNum_comensales_int(); i++) {
			System.out.println("Introduzca la comida:");
			String comida = sc.nextLine();
			comidas.add(comida);
		}
		return comidas;
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