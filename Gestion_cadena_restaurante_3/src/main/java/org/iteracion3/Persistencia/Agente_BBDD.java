package org.iteracion3.Persistencia;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



public class Agente_BBDD {

	private static final String base = "BC01dbservice";
	private static final String user = "BC01";
	private static final String password = "@ISoft2.2020#";
	private static final String url = "jdbc:mysql://172.20.48.70:3306/"+base+"?autoReconnect=true&useSSL=false";
	

public static Connection getAgente() {
	Connection con = null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");	
		con = DriverManager.getConnection(url, user, password);
		
	}catch(ClassNotFoundException ex) {
	
		JOptionPane.showMessageDialog(null, "Error al cargar el controlador de la BD", null, 0);
		Logger.getLogger(Agente_BBDD.class.getName()).log(Level.SEVERE, null, ex);
	
	} catch(SQLException ex) {
		
		JOptionPane.showMessageDialog(null, "Error al conectar con la BD", null, 0);
		Logger.getLogger(Agente_BBDD.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	return con;

}
}
