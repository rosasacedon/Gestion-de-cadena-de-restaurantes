package org.iteracion2.Dominio;

public class Camarero_Sala extends Camarero {
	public int idCamareroSala;
	public Mesa [] mesas;
	
	public Camarero_Sala (int idCamareroSala, Mesa [] mesas) {
		this.idCamareroSala = idCamareroSala;
		this.mesas = mesas;
	}

	public void setIdCamareroMesa(int aIdCamareroSala) {
		this.idCamareroSala = aIdCamareroSala;
	}

	public int getIdCamareroMesa() {
		return this.idCamareroSala;
	}

	public void setMesas(int aMesas) {
		this.idCamareroSala = aMesas;
	}
	
	public Mesa[] getMesas() {
		return this.mesas;
	}
	
}