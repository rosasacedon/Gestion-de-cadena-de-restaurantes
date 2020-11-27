package isoft22021bc01.isoft2.bc01.Dominio;

public class gestor_Jefe_de_Sala {

    private Camarero camarero;
    private Mesa mesa;
    
    public void asignarCamarero() {
        mesa.setCamarero(camarero);
    }

    public void asignarMesa() {
        camarero.setMesa(mesa);
    }

    public void gestion_estados_mesa(String opcion){
        switch(opcion){
            case "Libre":
                mesa.setEstado(Estados.Libre);
                break;
            case "Reservada":
                mesa.setEstado(Estados.Reservada);
                break;
            case "Ocupada":
                mesa.setEstado(Estados.Ocupada);
                break;
            case "Pidiendo":
                mesa.setEstado(Estados.pidiendo);
                break;
            case "Espera comida":
                mesa.setEstado(Estados.espera_comida);
                break;
            case "Servida":
                mesa.setEstado(Estados.servida);
                break;
            case "Espera cuenta":
                mesa.setEstado(Estados.espera_cuenta);
                break;
            case "Pagando":
                mesa.setEstado(Estados.pagando);
                break;
            case "En preparacion":
                mesa.setEstado(Estados.preparacion);
                break;
        }
    }
    
    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public Camarero getCamarero() {
        return camarero;
    }

}
