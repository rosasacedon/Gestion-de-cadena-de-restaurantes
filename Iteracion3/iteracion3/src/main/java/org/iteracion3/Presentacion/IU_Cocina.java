package org.iteracion3.Presentacion;

import java.awt.EventQueue;


import org.iteracion3.Dominio.Gestor_cocina;

public class IU_Cocina {

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			        Gestor_cocina gc = new Gestor_cocina();
			        gc.actualizar_ingredientes();
			       // gc.actualizar_bebidas();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

		
