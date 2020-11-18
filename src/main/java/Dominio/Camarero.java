package Dominio;

public class Camarero {

    private int num_camarero;
    private String nombre;

    public Camarero(int num_camarero, String nombre) {
        this.num_camarero = num_camarero;
        this.nombre = nombre;
    }

    public void setNum_camarero(int num_camarero) {
        this.num_camarero = num_camarero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_camarero() {
        return num_camarero;
    }

    public String getNombre() {
        return nombre;
    }

}
