package org.iteracion2.Dominio;

import java.util.ArrayList;

public class Platos {
	private String nombre;
	private int idPlato;
	private int cantidad;
	private double precio;
	private ArrayList <String> ingredientes; 
	
	public Platos(String nombre, int idPlato, int cantidad, double precio, ArrayList <String> ingredientes) {
		super();
		this.nombre = nombre;
		this.idPlato = idPlato;
		this.cantidad = cantidad;
		this.precio = precio;
		this.ingredientes = ingredientes;
	}
	
	public Platos () {}
	
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

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public ArrayList <String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList <String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}