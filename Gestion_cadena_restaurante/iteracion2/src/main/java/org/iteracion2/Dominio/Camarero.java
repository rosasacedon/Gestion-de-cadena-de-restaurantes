package org.iteracion2.Dominio;

public abstract class Camarero {
	private int idCamarero;
	private String nombre;
	
	public int getIdCamarero() {
		return idCamarero;
	}
	public void setIdCamarero(int idCamarero) {
		this.idCamarero = idCamarero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}