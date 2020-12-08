package Dominio;


public class Mesa {

    private int id_mesa;
    private int num_comensales_int;
    private Estados estado;
    private Camarero_Sala camarero;
    private Jefe_de_Sala jefeSala;

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

    public Jefe_de_Sala getJefeSala() {
        return jefeSala;
    }

    public void setCamarero(Camarero_Sala camarero) {
        this.camarero = camarero;
    }

    public void setJefeSala(Jefe_de_Sala jefeSala) {
        this.jefeSala = jefeSala;
    }

}
