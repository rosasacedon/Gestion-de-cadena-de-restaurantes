package org.iteracion2.Dominio;

public class Gestor_Cocina {
	
	public void RecibirAvisoComanda() {
		throw new UnsupportedOperationException();
	}

	public static void MandarAvisoServir() {
		
		int aviso = 0;
		int var;
		Cocina c= new Cocina();
		var=c.getIdCocina();
		
		if(var==0) {
			var = aviso; 
			System.out.println("El pedido esta listo");
		}
		else {
			System.out.println("El pedido todavia no esta listo");
		}
	}
}