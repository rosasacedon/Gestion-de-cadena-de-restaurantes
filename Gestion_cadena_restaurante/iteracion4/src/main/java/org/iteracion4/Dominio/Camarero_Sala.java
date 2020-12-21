package org.iteracion4.Dominio;

public class Camarero_Sala {

	private int id_camarero;
	private String nombre;
	
	

	public Camarero_Sala(int id_camarero, String nombre) {
		super();
		this.id_camarero = id_camarero;
		this.nombre = nombre;
		
	}
	
	public int getId_camarero() {
		return id_camarero;
	}

	public void setId_camarero(int id_camarero) {
		this.id_camarero = id_camarero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}