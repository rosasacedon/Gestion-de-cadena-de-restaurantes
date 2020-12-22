package org.iteracion2.Dominio;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}