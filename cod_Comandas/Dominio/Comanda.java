package Dominio;
import java.util.Vector;

public class Comanda {
	private int _idComanda;
	public Mesa _unnamed_Mesa_;
	public Vector<Platos> _unnamed_Platos_ = new Vector<Platos>();
	public Vector<Bebidas> _unnamed_Bebidas_ = new Vector<Bebidas>();

	public void setIdComanda(int aIdComanda) {
		this._idComanda = aIdComanda;
	}

	public int getIdComanda() {
		return this._idComanda;
	}
}