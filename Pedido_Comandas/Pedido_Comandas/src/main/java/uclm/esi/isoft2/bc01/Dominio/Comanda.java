package uclm.esi.isoft2.bc01.Dominio;
import java.util.Vector;

public class Comanda {
	private int idComanda;
	public Mesa Mesa;
	public Bebidas[] bebidas;
	public Platos[] platos;

	public void setIdComanda(int aIdComanda) {
		this.idComanda = aIdComanda;
	}

	public int getIdComanda() {
		return this.idComanda;
	}
}