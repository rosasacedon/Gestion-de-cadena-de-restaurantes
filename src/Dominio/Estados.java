package Dominio;

public enum Estados {
	;

	public int getLibre() {
		return libre;
	}
	public void setLibre(int libre) {
		this.libre = libre;
	}
	public int getReservada() {
		return reservada;
	}
	public void setReservada(int reservada) {
		this.reservada = reservada;
	}
	public int getOcupada() {
		return ocupada;
	}
	public void setOcupada(int ocupada) {
		this.ocupada = ocupada;
	}
	public int getPidiendo() {
		return pidiendo;
	}
	public void setPidiendo(int pidiendo) {
		this.pidiendo = pidiendo;
	}
	public int getEn_espera() {
		return en_espera;
	}
	public void setEn_espera(int en_espera) {
		this.en_espera = en_espera;
	}
	public int getServicios() {
		return servicios;
	}
	public void setServicios(int servicios) {
		this.servicios = servicios;
	}
	public int getPagando() {
		return pagando;
	}
	public void setPagando(int pagando) {
		this.pagando = pagando;
	}
	public int getEn_preparacion() {
		return en_preparacion;
	}
	public void setEn_preparacion(int en_preparacion) {
		this.en_preparacion = en_preparacion;
	}
	private int libre;
	private int reservada;
	private int ocupada;
	private int pidiendo;
	private int en_espera;
	private int servicios;
	private int pagando;
	private int en_preparacion;

}