package org.iteracion2.Dominio;

public class Mesa {
	
	public Comanda[] comandas;
	public Camarero_Sala Camarero_Sala;
    public int id_mesa;
    private int num_comensales_int;
    private EstadosMesa estado;


	public void SecuenciarEstados() {
		throw new UnsupportedOperationException();
	}

	public void setIdMesa(int aIdMesa) {
		this.id_mesa = aIdMesa;
	}

	public int getIdMesa() {
		return this.id_mesa;
	}

	public int getNum_comensales_int() {
	    return num_comensales_int;
	}

	public void setNum_comensales_int(int num_comensales_int) {
	    this.num_comensales_int = num_comensales_int;
	}

	 public EstadosMesa getEstado() {
	     return estado;
	 }

	 public void setEstado(EstadosMesa estado) {
	     this.estado = estado;
	 }

	 public Camarero getCamarero_Sala() {
	     return Camarero_Sala;
	 }

	 public void setCamarero_Sala(Camarero_Sala Camarero_Sala) {
	     this.Camarero_Sala = Camarero_Sala;
	 }
}