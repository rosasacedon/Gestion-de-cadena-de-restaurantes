package org.iteracion4.Persistencia;

import java.sql.*;
import java.util.Vector;

public class AgenteBBDD {
	//instancia del agente
	protected static AgenteBBDD mInstancia=null;
	//Conexion con la base de datos
	protected static Connection mBD;
	private static final String user = "BC01";
	private static final String password = "@ISoft2.2020#";
	//Identificador ODBC de la base de datos
	private static String url="jdbc:mysql://172.20.48.70:3306/BC01dbservice?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//Driven para conectar con bases de datos Microsoft Access 
	
	private static String driver="com.mysql.cj.jdbc.Driver";

	//Constructor
	public AgenteBBDD()throws Exception {
		conectar();

	}


	public static AgenteBBDD getAgente() throws Exception{
		if (mInstancia==null){
			mInstancia=new AgenteBBDD();
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
		
		mBD=DriverManager.getConnection(url, user, password);
		desconectar();
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

	public Vector<String> select_comida(String SQL) throws SQLException,Exception{


		PreparedStatement select = mBD.prepareStatement(SQL);

		ResultSet s = select.executeQuery();
		Vector<String> auxiliar = null;
		while (s.next()) {
			auxiliar=new Vector<String>();
			auxiliar.add((String)s.getString("idComida"));
			auxiliar.add((String)s.getString("nombre"));
			auxiliar.add((String)s.getString("precio"));
		}	


		this.desconectar();	
		return auxiliar;


	}
	
	public Vector<String> select_bebida(String SQL) throws SQLException,Exception{


		PreparedStatement select = mBD.prepareStatement(SQL);

		ResultSet s = select.executeQuery();
		Vector<String> auxiliar = null;
		while (s.next()) {
			auxiliar=new Vector<String>();
			auxiliar.add((String)s.getString("cantidad"));
			auxiliar.add((String)s.getString("idbebida"));
			auxiliar.add((String)s.getString("nombre"));
			auxiliar.add((String)s.getString("precio"));
		}	


		this.desconectar();	
		return auxiliar;


	}

}