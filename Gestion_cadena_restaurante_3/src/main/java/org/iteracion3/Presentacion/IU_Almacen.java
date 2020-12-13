package org.iteracion3.Presentacion;

import java.awt.EventQueue;

import org.iteracion3.Dominio.Gestor_almacen;

public class IU_Almacen {

	private int formularioIngredientes;
	private int formularioBebidas;

	
public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			        Gestor_almacen ga = new Gestor_almacen();
			        ga.lanzar_alarma_ingredientes();
			        ga.lanzar_alarma_bebidas();
			        ga.actualizar_ingredientes();
			        ga.actualizar_bebidas();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

		
	
