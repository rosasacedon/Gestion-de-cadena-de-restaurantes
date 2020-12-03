package uclm.esi.isoft2.bc01.Dominio;

import java.util.Vector;

public class Platos {
	private String nombre;
	private int idPlato;
	private int cantidad;
	private double precio;
	private String ingredientes [];
	public Comanda[] comandas;

	public void setNombre(String aNombre) {
		this.nombre = aNombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setCantidad(int aCantidad) {
		this.cantidad = aCantidad;
	}

	public int getCantidad() {
		return this.cantidad;
	}
}