package org.iteracion3.Dominio;

public class Camarero {
	
	public Camarero(String nombre, int id_trabajador) {
		super();
		this.nombre = nombre;
		this.id_trabajador = id_trabajador;
	}
	private String nombre;
	private int id_trabajador;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_trabajador() {
		return id_trabajador;
	}
	public void setId_trabajador(int Id_trabajador) {
		this.id_trabajador = Id_trabajador;
	}


}