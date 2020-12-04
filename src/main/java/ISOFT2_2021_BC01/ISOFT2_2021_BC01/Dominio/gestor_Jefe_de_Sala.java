package ISOFT2_2021_BC01.ISOFT2_2021_BC01.Dominio;

import java.util.ArrayList;

public class gestor_Jefe_de_Sala {

    private Camarero_Sala camarero;
    private Mesa mesa;
   
    
    public void asignarCamarero() {
    	ArrayList<Camarero_Sala> lcamarero = new ArrayList<Camarero_Sala>();
    	for(int i=0;i<lcamarero.size();i++) {
    		mesa.setCamarero(lcamarero.get(i));
    	}
        
    }

    public void asignarMesa() {
    	if(mesa.getNum_comensales_int()==2 || mesa.getNum_comensales_int()==4 || mesa.getNum_comensales_int()==6) {
    		System.out.println("Mesa reservada correctamente.");
    		gestion_estados_mesa("Reservada");
    		camarero.setMesa(mesa);
    	} else {
    		System.out.println("Mesa no disponible.");
    	}
        
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
    
    public void setCamarero(Camarero_Sala camarero) {
        this.camarero = camarero;
    }

    public Camarero_Sala getCamarero() {
        return camarero;
    }

}
