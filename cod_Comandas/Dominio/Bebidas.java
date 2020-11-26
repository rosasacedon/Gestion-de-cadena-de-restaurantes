package Dominio;

import java.util.Vector;

public class Bebidas {
	private int _idBebida;
	private String _nombre;
	private int _cantidad;
	private double _precio;
	public Vector<Comanda> _unnamed_Comanda_ = new Vector<Comanda>();

	public void setIdBebida(int aIdBebida) {
		this._idBebida = aIdBebida;
	}

	public int getIdBebida() {
		return this._idBebida;
	}

	public void setCantidad(int aCantidad) {
		this._cantidad = aCantidad;
	}

	public int getCantidad() {
		return this._cantidad;
	}
}