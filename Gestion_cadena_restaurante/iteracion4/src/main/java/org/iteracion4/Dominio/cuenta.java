package org.iteracion4.Dominio;

import java.util.ArrayList;
import java.util.Iterator;

import org.iteracion4.Persistencia.AgenteBBDD;

public class Cuenta {

	private int id_cuenta;
	private double precio;
	private ArrayList<String> bebidas;
	private ArrayList<String> comidas;

	public Cuenta(int id_cuenta, ArrayList<String> bebidas, ArrayList<String> comidas) {
		this.id_cuenta = id_cuenta;
		this.precio = calcular_precio();
		this.bebidas = bebidas;
		this.comidas = comidas;
	}

	public double calcular_precio() {
		Iterator<String> it = bebidas.iterator();
		Iterator<String> it2 = comidas.iterator();
		ArrayList<String> cuenta = new ArrayList<String>();
		String sql, sql1;
		AgenteBBDD agent = null;
		precio = 0;
		try {
			agent = new AgenteBBDD();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (it.hasNext()) {
			String nombre = it.next().toString();
			ArrayList<?> aux = new ArrayList();
			sql1 = "SELECT * FROM Bebida WHERE nombre = '" + nombre + "'; ";
			try {
				aux = (ArrayList<?>) agent.select_bebida(sql1).clone();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cuenta.add((String) aux.get(4));
		}
		
		while (it2.hasNext()) {
			String nombre = it.next().toString();
			ArrayList<?> aux = new ArrayList();
			sql = "SELECT * FROM Comida WHERE nombre = '" + nombre + "'; ";
			try {
				aux = (ArrayList<?>) agent.select_comida(sql).clone();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cuenta.add((String) aux.get(3));
		}
		for (int i = 0; i< cuenta.size();i++) {
			precio += Integer.parseInt(cuenta.get(i));
		}
		return precio;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<String> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<String> bebidas) {
		this.bebidas = bebidas;
	}

	public ArrayList<String> getComidas() {
		return comidas;
	}

	public void setComidas(ArrayList<String> comidas) {
		this.comidas = comidas;
	}

}