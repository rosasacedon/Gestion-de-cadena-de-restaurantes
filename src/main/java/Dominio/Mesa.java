package Dominio;

public class Mesa {

    private int id;
    private int num_comensales_int;

    public enum Estados {
        libre,
        reservada,
        ocupada,
        pidiendo,
        en_espera,
        servicios,
        pagando,
        en_preparacion

    }

    public Mesa(int id, int num_comensales_int) {
        this.id = id;
        this.num_comensales_int = num_comensales_int;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_comensales_int(int num_comensales_int) {
        this.num_comensales_int = num_comensales_int;
    }

    public int getId() {
        return id;
    }

    public int getNum_comensales_int() {
        return num_comensales_int;
    }

}
