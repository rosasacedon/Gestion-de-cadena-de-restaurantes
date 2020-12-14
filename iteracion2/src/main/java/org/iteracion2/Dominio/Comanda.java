package org.iteracion2.Dominio;

import java.util.ArrayList;

public class Comanda {
	private int idComanda;
	public Mesa Mesa;
	public Bebidas[] bebidas;
	public ArrayList<Platos> platos;
	
	public Comanda(Platos plato) {
		platos = new ArrayList<Platos>();
		platos.add(plato);
	}

	public void setIdComanda(int aIdComanda) {
		this.idComanda = aIdComanda;
	}

	public int getIdComanda() {
		return this.idComanda;
	}

}