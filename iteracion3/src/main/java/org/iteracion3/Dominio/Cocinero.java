
package org.iteracion3.Dominio;

public class Cocinero {

	private int id_cocinero;
	private String nombre_cocinero;
	
	public int getId_cocinero() {
		return id_cocinero;
	}
	public void setId_cocinero(int id_cocinero) {
		this.id_cocinero = id_cocinero;
	}
	public String getNombre_cocinero() {
		return nombre_cocinero;
	}
	public void setNombre_cocinero(String nombre_cocinero) {
		this.nombre_cocinero = nombre_cocinero;
	}
	public Cocinero(int id_cocinero, String nombre_cocinero) {
		super();
		this.id_cocinero = id_cocinero;
		this.nombre_cocinero = nombre_cocinero;
	}

}