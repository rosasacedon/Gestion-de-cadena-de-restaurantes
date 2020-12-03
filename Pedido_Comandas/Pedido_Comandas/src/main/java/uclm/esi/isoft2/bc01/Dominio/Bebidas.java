package uclm.esi.isoft2.bc01.Dominio;

import java.util.Vector;

public class Bebidas {
	private int idBebida;
	private String nombre;
	private int cantidad;
	private double precio;
	public Comanda[] comandas;

	public void setIdBebida(int aIdBebida) {
		this.idBebida = aIdBebida;
	}

	public int getIdBebida() {
		return this.idBebida;
	}

	public void setCantidad(int aCantidad) {
		this.cantidad = aCantidad;
	}

	public int getCantidad() {
		return this.cantidad;
	}
}