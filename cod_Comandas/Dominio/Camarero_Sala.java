package Dominio;

import java.util.Vector;
import Dominio.Mesa;

public class Camarero_Sala extends Camarero {
	private int _idCamareroMesa;
	public Vector<Mesa> _unnamed_Mesa_ = new Vector<Mesa>();

	public void setIdCamareroMesa(int aIdCamareroMesa) {
		this._idCamareroMesa = aIdCamareroMesa;
	}

	public int getIdCamareroMesa() {
		return this._idCamareroMesa;
	}
}