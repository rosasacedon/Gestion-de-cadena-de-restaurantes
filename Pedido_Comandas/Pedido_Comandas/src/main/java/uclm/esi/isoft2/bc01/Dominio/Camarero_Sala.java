package uclm.esi.isoft2.bc01.Dominio;

import java.util.Vector;
import uclm.esi.isoft2.bc01.Dominio.Mesa;

public class Camarero_Sala extends Camarero {
	private int idCamareroSala;
	public Mesa [] mesas;

	public void setIdCamareroMesa(int aIdCamareroSala) {
		this.idCamareroSala = aIdCamareroSala;
	}

	public int getIdCamareroMesa() {
		return this.idCamareroSala;
	}
}