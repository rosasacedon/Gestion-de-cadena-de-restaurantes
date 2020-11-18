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

}
