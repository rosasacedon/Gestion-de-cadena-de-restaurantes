package Dominio;

import java.util.Vector;

public class Platos {
	private String _nombre;
	private int _idPlato;
	private int _cantidad;
	private double _precio;
	private String ingredientes [];
	public Vector<Comanda> _unnamed_Comanda_ = new Vector<Comanda>();

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setCantidad(int aCantidad) {
		this._cantidad = aCantidad;
	}

	public int getCantidad() {
		return this._cantidad;
	}
}