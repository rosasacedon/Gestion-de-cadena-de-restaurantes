package org.iteracion1.Dominio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.iteracion1.Persistencia.Agente_BBDD;

public class gestor_Jefe_de_Sala {

    private Camarero_Sala camarero;
    private Mesa mesa;

    public void asignarCamarero() {
        Random r = new Random();
        asignarMesa();
        ArrayList<Camarero_Sala> lcamarero = (ArrayList<Camarero_Sala>) select().clone();
        int random=r.nextInt(lcamarero.size() - 1);
        System.out.println("camarero" + lcamarero.get(random));

        mesa.setCamarero(lcamarero.get(random));

    }

    public ArrayList<Camarero_Sala> select() {
         Vector<String> vec = null;
        try {
            String SQL_Consulta = "SELECT * FROM Camarero_Sala WHERE id_camarero = '" + 2 + "'; ";
            Agente_BBDD a = Agente_BBDD.getAgente();
            vec = a.select(SQL_Consulta);
        } catch (Exception ex) {
            Logger.getLogger(gestor_Jefe_de_Sala.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Camarero_Sala> camareros = new ArrayList<Camarero_Sala>();
        for (int i = 0; i < vec.size(); i++) {
            int id = 0;
            String nombre = null;
            if (isInteger(vec.get(i))) {
                id = Integer.parseInt(vec.get(i));
            } else {
                nombre = vec.get(i);
            }
            camareros.add(new Camarero_Sala(id, nombre, new Mesa()));
        }

        return camareros;
    }

    public boolean isInteger(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void asignarMesa() {
    	mesa = new Mesa();
        if (mesa.getNum_comensales_int() == 2 || mesa.getNum_comensales_int() == 4 || mesa.getNum_comensales_int() == 6) {
            System.out.println("Mesa reservada correctamente.");
            gestion_estados_mesa("Reservada");
            camarero.setMesa(mesa);
        } else {
            System.out.println("Mesa no disponible.");
        }

    }

    public void gestion_estados_mesa(String opcion) {
        switch (opcion) {
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
