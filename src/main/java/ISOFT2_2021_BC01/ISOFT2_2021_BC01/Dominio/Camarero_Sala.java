package ISOFT2_2021_BC01.ISOFT2_2021_BC01.Dominio;

public class Camarero_Sala {

    private int id_camarero;
    private String nombre;
    private Mesa mesa;

    public Camarero_Sala(int id, String nombre, Mesa mesa) {
    	this.id_camarero=id;
    	this.nombre=nombre;
    	this.mesa=mesa;
    }
    public int getId_camarero() {
        return id_camarero;
    }

    public void setId_camarero(int id_camarero) {
        this.id_camarero = id_camarero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
