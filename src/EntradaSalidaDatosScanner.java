import java.util.*; //Importo el paquete java.util para usar sus clases.

import javax.swing.JOptionPane;
public class EntradaSalidaDatosScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*===========================*/
		/*==== Utilizando Scanner ====*/
		/*===========================*/
		Scanner entrada = new Scanner(System.in);// Creo el objeto entrada
		
		System.out.println("Introduce tu nombre, por favor:");
		String nombreUsuario = entrada.nextLine(); //Guardo en la variable la informaci�n suministrada
		System.out.println("Introduce tu edad, por favor:");
		int edad = entrada.nextInt(); //Guardo en la variable la informaci�n suministrada
		
		System.out.println("Hola " + nombreUsuario + ", el a�o que viene tendr�s " + (edad+1) + " a�os.");
		
	}

}