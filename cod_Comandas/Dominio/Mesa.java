package Dominio;

import java.util.Vector;

public class Mesa {
	private EstadosMesa _estado;
	private int _idMesa;
	private int _num_comensales;
	public Vector<Comanda> _unnamed_Comanda_ = new Vector<Comanda>();
	public Camarero_Sala _unnamed_Camarero_Sala_;

	public void SecuenciarEstados() {
		throw new UnsupportedOperationException();
	}

	public void setIdMesa(int aIdMesa) {
		this._idMesa = aIdMesa;
	}

	public int getIdMesa() {
		return this._idMesa;
	}
}