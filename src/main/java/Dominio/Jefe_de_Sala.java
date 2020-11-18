package Dominio;

public class Jefe_de_Sala {

    private int id_jefe_sala;
    private String nombre;

    public Jefe_de_Sala(int id_jefe_sala, String nombre) {
        this.id_jefe_sala = id_jefe_sala;
        this.nombre = nombre;
    }

    public void setId_jefe_sala(int id_jefe_sala) {
        this.id_jefe_sala = id_jefe_sala;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_jefe_sala() {
        return id_jefe_sala;
    }

    public String getNombre() {
        return nombre;
    }

}
