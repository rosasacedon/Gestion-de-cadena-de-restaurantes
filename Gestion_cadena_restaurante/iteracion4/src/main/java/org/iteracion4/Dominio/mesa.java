package org.iteracion4.Dominio;

public class mesa {

	private int id_mesa;
	private int num_comensales_int;
	private Estados estado;
	private Camarero_Sala camarero;
	
	

	public mesa(int id_mesa, int num_comensales_int, Estados estado, Camarero_Sala camarero) {
		super();
		this.id_mesa = id_mesa;
		this.num_comensales_int = num_comensales_int;
		this.estado = estado;
		this.camarero = camarero;
	}

	public int getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}

	public int getNum_comensales_int() {
		return num_comensales_int;
	}

	public void setNum_comensales_int(int num_comensales_int) {
		this.num_comensales_int = num_comensales_int;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public Camarero_Sala getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero_Sala camarero) {
		this.camarero = camarero;
	}
}