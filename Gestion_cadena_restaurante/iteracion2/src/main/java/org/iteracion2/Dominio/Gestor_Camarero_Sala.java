package org.iteracion2.Dominio;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

import org.iteracion2.Persistencia.Agente_BBDD;

public class Gestor_Camarero_Sala {

	final static Scanner TECLADO =new Scanner (System.in);
	private static final boolean InputMismatchException = false;

	public static void main (String [] args) throws IOException {

		Platos plato;
		Mesa mesa;	
		Gestor_Camarero_Sala csala = new Gestor_Camarero_Sala();

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; 

		while(!salir){

			System.out.println("1. Anotar comanda");
			System.out.println("2. Registrar mesa");
			System.out.println("3. Salir");	            
			System.out.println("Escribe una de las opciones");
			opcion = sn.nextInt();

			switch(opcion){
			case 1:
				anotarComanda();
				break;
			case 2:
				RegistrarMesa();
				break;
			case 3:
				salir=true;
				break;
			default:
				System.out.println("Solo números entre 1 y 3");
			}
		}
	}

	public static void anotarComanda() {

		int opcion=1;
		String Pplato = "";
		String Splato = "";
		String Postre = "";
		boolean salir = false;

		try {
			while (opcion <= 3) {
				System.out.println("NUESTRO MENU:\nELIJA:\n1 Primer plato\n2 Segundo plato\n3 Postre");
				opcion=TECLADO.nextInt();
				do {
					switch(opcion) {
					case 1 : 
						Pplato = PrimerPlato();
						System.out.println("El primer plato es: "+PrimerPlato());
						break;
					case 2: 
						Splato = SegundoPlato();
						System.out.println("El primer plato es: "+PrimerPlato()+ "El segundo plato es: " +SegundoPlato());
						break;
					case 3: 
						Postre = Postre();
						System.out.println("El primer plato es: "+ Pplato + "El segundo plato es: " + Splato + "El postre es: " + Postre);
						opcion = 0;
						break;
					default:
						System.out.println("Error");
						salir = true;
					}
				}while(salir ==false);
			}
		} catch(Exception e) {
			System.out.println("Se ha producido un error al coger la opcion");
		}
		System.out.println("Recogido todos los datos del pedido");
	}

	public static String PrimerPlato() {
		Platos pplato = new Platos();
		int operacion = 0;
		String variable=" ";

		try {
			while(operacion <= 3) {
				System.out.println("Elija en nuestro menu: \n1:Ensalada de frutos secos , \n2:coliflor cocida , \n3:patatas bacon y cheese ");
				operacion = TECLADO.nextInt(); 
				switch(operacion) {
				case 1: 
					variable= pplato.getNombre();
					SegundoPlato();
					operacion = 0;
					break;
				case 2: 
					variable= pplato.getNombre();
					SegundoPlato();
					break;
				case 3: 
					variable= pplato.getNombre();
					SegundoPlato();
					break;
				default:
					System.out.println("La opcion "+operacion+" no está en el menú.");
				}
			}
		} 
		catch(Exception e) {
			System.out.println("Se ha producido un error al coger la opcion");
		}
		return variable;
	}

	private static String SegundoPlato() {
		Platos splato = new Platos();
		int operacion = 3;
		String variable="";
		boolean salir = false;

		try {
			//while(operacion <= 3) {
			while (!salir) {
				System.out.println("Elija en nuestro menu: \n1:Tortilla de patatas , \n2:Solomillo a la plancha , \n3:Pescado en tempura ");
				operacion = TECLADO.nextInt(); 
				switch(operacion) {
				case 1: 
					variable= splato.getNombre();
					Postre();
					operacion = 0;
					salir = true;
					break;
				case 2: 
					variable= splato.getNombre();
					Postre();
					salir = true;
					break;
				case 3: 
					variable= splato.getNombre();
					Postre();
					salir = true;
					break;
				default:
					System.out.println("La opcion "+operacion+" no está en el menú.");
				}
			}
		}
		catch(Exception e) {
			System.out.println("Se ha producido un error al coger la opcion");
		}
		return variable;
	}

	private static String  Postre() {
		Platos postre = new Platos();
		int operacion = 3;
		String variable ="";
		boolean salir = false;

		try {
			//while(operacion <= 3) {
			while (!salir) {
				System.out.println("Elija en nuestro menu:\n1:Helado\n2:Cafe\n3:Tarta de queso ");
				operacion = TECLADO.nextInt();
				switch(operacion) {
				case 1: 
					variable= postre.getNombre();
					salir = true;
					operacion = 0;
					break;
				case 2: 
					variable= postre.getNombre();
					salir = true;
					break;
				case 3: 
					variable= postre.getNombre();
					salir = true;
					break;
				default:
					System.out.println("La opcion "+operacion+" no está en el menú.");
					salir = false;
					break;
				}
			}
		} catch(Exception e) {
			System.out.println("Se ha producido un error al coger la opcion");
		}

		return variable;
	}

	public static void ConsultarIngredientes() {
		Scanner sc = new Scanner(System.in);
		int idPlato = 0;
		try {
			idPlato=sc.nextInt();
		}catch(NumberFormatException e) {
			System.err.println("Error al leer dato.");
		}

		ArrayList<String> lingredientes = select(idPlato);
		System.out.println("Ingredientes" + lingredientes.get(2));

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<String> select(int idPlatos) {

		String SQL_Consulta = "SELECT * FROM Platos WHERE idPlato = '" + idPlatos + "'; ";
		Agente_BBDD a;
		ArrayList vec = null;
		try {
			a = Agente_BBDD.getAgente();
			vec = a.select(SQL_Consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ArrayList <String> ingredientes = new ArrayList<String>();
		int idPlato = (int) vec.get(0);
		String nombre = (String) vec.get(1);
		int cantidad = (int) vec.get(2);
		float precio = (float) vec.get(3);
		ingredientes = (ArrayList<String>) vec.get(4);

		Comanda comanda = new Comanda (new Platos(nombre, idPlato, cantidad, precio, ingredientes));

		return ingredientes;
	}


	public void enviarComanda() {
		throw new UnsupportedOperationException();
	}

	public static void RegistrarMesa() throws IOException{

		Mesa m = new Mesa();

		System.out.print("Ingrese el codigo de la mesa: " + m.getIdMesa());
		System.out.print("Ingrese el numero de comensales: " + m.getNum_comensales_int());

	}

	public void RegistarEstado() {
		throw new UnsupportedOperationException();
	}

	public void RegistrarComanda() {
		throw new UnsupportedOperationException();
	}

	public Platos ValidarIngredientes() {
		throw new UnsupportedOperationException();
	}

	public void Servir() {
		throw new UnsupportedOperationException();
	}
}