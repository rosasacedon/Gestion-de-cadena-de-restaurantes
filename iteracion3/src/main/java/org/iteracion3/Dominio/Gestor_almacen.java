package org.iteracion3.Dominio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.iteracion3.Persistencia.Agente_BBDD;


public class Gestor_almacen extends Agente_BBDD{
	

	public boolean actualizar_ingredientes() throws Exception {
		
		String sql = "SELECT * FROM ingredientes WHERE cantidad < 4";
		PreparedStatement ps = null;
		Connection con = (Connection) getAgente();
		
			try {
				ps = con.prepareStatement(sql);
				ResultSet resultado = ps.executeQuery(sql);
				if (resultado!=null){
					System.out.println("REPOSICIÓN DE INGREDIENTES:");
					while(resultado.next()){
						int id = resultado.getInt("idingrediente");
						String nombre = resultado.getString("nombre");
						System.out.println("Se ha realizado un pedido al proveedor de "+nombre);
						String sql1 = "UPDATE ingredientes SET cantidad='15' WHERE idingrediente="+id;
						PreparedStatement ps1 = null;
						Connection con1 = (Connection) getAgente();
						ps1 = con1.prepareStatement(sql1);
						ps1.executeUpdate(sql1);
						
					}
					System.out.print("\n\n");
					return true;
					
				}
					return true;
				
			}catch(SQLException ex) {
				Logger.getLogger(Gestor_almacen.class.getName()).log(Level.SEVERE, null, ex);
				return false;
			}
		
	}


	public boolean actualizar_bebidas() {
		
		String sql = "SELECT * FROM bebidas WHERE cantidad < 4";
		PreparedStatement ps = null;
		Connection con = getAgente();
		
			try {
				ps = con.prepareStatement(sql);
				ResultSet resultado = ps.executeQuery(sql);
				if (resultado!=null){
					System.out.println("REPOSICIÓN DE BEBIDAS:");
					while(resultado.next()){
						int id = resultado.getInt("idbebida");
						String nombre = resultado.getString("nombre");
						System.out.println("Se ha realizado un pedido al proveedor de "+nombre);
						String sql1 = "UPDATE bebidas SET cantidad='15' WHERE idbebida="+id;
						PreparedStatement ps1 = null;
						Connection con1 = getAgente();
						ps1 = con1.prepareStatement(sql1);
						ps1.executeUpdate(sql1);
						
					}
					return true;
					
				}
				
				return true;

			}catch(SQLException ex) {
				Logger.getLogger(Gestor_almacen.class.getName()).log(Level.SEVERE, null, ex);
				return false;
			}
		
	}

	
	public boolean lanzar_alarma_ingredientes() {
		
		String sql = "SELECT * FROM ingredientes WHERE cantidad < 4";
		PreparedStatement ps = null;
		Connection con = getAgente();
		
		try {
			ps = con.prepareStatement(sql);
			ResultSet resultado = ps.executeQuery(sql);
			if (resultado!=null){
				System.out.print("ADVERTENCIA INGREDIENTES: \n");
				while(resultado.next()){
					String necesario = resultado.getString("nombre");
					System.out.println("¡Es necesario realizar un pedido de "+necesario+"!");
					
				}
				System.out.print("\n\n");
				return true;
				
			}
			
			return true;
			
		}catch(SQLException ex) {
			Logger.getLogger(Gestor_almacen.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}	
		
	
	public boolean lanzar_alarma_bebidas() {		
		String sql = "SELECT * FROM bebidas WHERE cantidad < 4";
		PreparedStatement ps = null;
		Connection con = getAgente();
		
		try {
			ps = con.prepareStatement(sql);
			ResultSet resultado = ps.executeQuery(sql);
			if (resultado!=null){
				System.out.print("ADVERTENCIA BEBIDAS: \n");
				while(resultado.next()){
					String necesario = resultado.getString("nombre");
					System.out.println("¡Es necesario realizar un pedido de "+necesario+"!");
					
				}
				System.out.print("\n\n");
				return true;
				
			}
			
			return true;
			
		}catch(SQLException ex) {
			Logger.getLogger(Gestor_almacen.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

}
