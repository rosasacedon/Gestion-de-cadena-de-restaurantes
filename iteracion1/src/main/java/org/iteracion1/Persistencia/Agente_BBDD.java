package protected org.iteracion1.Persistencia;

import java.sql.*;
import java.util.Vector;

public class Agente_BBDD {
	//instancia del agente
	protected static Agente_BBDD mInstancia=null;
	//Conexion con la base de datos
	protected static Connection mBD;
	private static final String user = "BC01";
	private static final String password = "@ISoft2.2020#"; //La contraseña nos ha dado fallo durante el mantenimiento, pero decidimos dejarla así puesto que si no no conecta con la BD.
	//Identificador ODBC de la base de datos
	private static String url="jdbc:mysql://172.20.48.70:3306/BC01dbservice?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//Driven para conectar con bases de datos Microsoft Access 
	
	private static String driver="com.mysql.cj.jdbc.Driver";

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
		stmt = null;
		return res;
		
	}

	public Vector<String> select(String SQL) throws SQLException,Exception{


		PreparedStatement select =
				mBD.prepareStatement(SQL);


		ResultSet s = select.executeQuery();
		Vector<String> auxiliar = null;
		while (s.next()) {
			auxiliar=new Vector<String>();
			auxiliar.add((String)s.getString("id_camarero"));
			auxiliar.add((String)s.getString("nombre"));
			auxiliar.add((String)s.getString("mesa"));
		}	
		PreparedStatement = null;
		s = null;
		PreparedStatement.close();
		this.desconectar();	
		return auxiliar;

	}

}