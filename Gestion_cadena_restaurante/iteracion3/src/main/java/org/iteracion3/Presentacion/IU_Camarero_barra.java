package org.iteracion3.Presentacion;

import java.awt.EventQueue;

import org.iteracion3.Dominio.Gestor_camarero_barra;

public class IU_Camarero_barra {

	
	
public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			        Gestor_camarero_barra gcb = new Gestor_camarero_barra();
			        gcb.actualizar_bebidas();
			       // gc.actualizar_bebidas();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
