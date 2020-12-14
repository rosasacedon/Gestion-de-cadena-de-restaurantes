package org.iteracion2.Persistencia;

import java.sql.*;
import java.util.ArrayList;

public class Agente_BBDD {
	//instancia del agente
	protected static Agente_BBDD mInstancia=null;
	//Conexion con la base de datos
	protected static Connection mBD;
	//Identificador ODBC de la base de datos
	private static String url="jdbc:mysql://172.20.48.70:3306/BC01dbservice?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//Driven para conectar con bases de datos Microsoft Access 
	
	private static String driver="com.mysql.jdbc.Driver";
	
	//Constructor
	private Agente_BBDD()throws Exception {
		conectar();

	}

	public static Agente_BBDD getAgente() throws Exception{
		if (mInstancia==null){
			mInstancia=new Agente_BBDD();
		}
		return mInstancia;
	}

	//Metodo para realizar la conexion a la base de datos 
	private void conectar() throws Exception {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException ex) {
		    System.out.println("Error al registrar el driver de MySQL: " + ex);
		}
		
		mBD=DriverManager.getConnection(url);
	}

	//Metodo para desconectar de la base de datos
	private void desconectar() throws Exception{
		mBD.close();
	}

	//Metodo para realizar una insercion en la base de datos
	public int insert(String SQL) throws SQLException, Exception{ 
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res=stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList select(String SQL) throws SQLException, Exception{

		PreparedStatement select = mBD.prepareStatement(SQL);

		ResultSet s = select.executeQuery();
		ArrayList auxiliar = new ArrayList();
		while (s.next()) {
			auxiliar.add(s.getInt("idPlato"));
			auxiliar.add(s.getString("nombre"));
			auxiliar.add(s.getInt("cantidad"));
			auxiliar.add(s.getFloat("Precio"));
			auxiliar.add(s.getArray("ingredientes"));
			
		}	

		this.desconectar();	
		
		return auxiliar;
	}

}