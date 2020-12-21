package org.iteracion3.Dominio;

public class Camarero_barra {

	private int id_camarero;
	
	//private static final Camarero_barra c = new Camarero_barra(1);
	
	public Camarero_barra(int id_camarero, String nombre_camarero) {
		super();
		this.id_camarero = id_camarero;
		this.nombre_camarero = nombre_camarero;
	}
	
	public int getId_camarero() {
		return id_camarero;
	}
	public void setId_camarero(int id_camarero) {
		this.id_camarero = id_camarero;
	}
	public String getNombre_camarero() {
		return nombre_camarero;
	}
	public void setNombre_camarero(String nombre_camarero) {
		this.nombre_camarero = nombre_camarero;
	}
	private String nombre_camarero;
	
}
