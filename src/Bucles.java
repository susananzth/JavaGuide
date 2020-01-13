import javax.swing.*;
import java.util.*;
public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Bucles indeterminados ==*/
		/*===========================*/
		
		//No se sabe cuantas veces se repetir� el bucle.
		
		/*------- Bucle while -------*/
		String clave = "Susana";
		
		String pass = "";
		
		while (clave.equals(pass) == false) { //Comparamos clave con pass utilizando 'equals'
			/* Si la consici�n es cierta, ejecutar� el c�digo dentro de estas llaves
			  hasta que se deje de cumplir la condici�n */
			
			
			//El while se repetira mientras la contrase�a sea incorrecta.
			pass = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			if (clave.contentEquals(pass) == false) {
				System.out.println("Contrase�a incorrecta!");
			}
		}
		System.out.println("Contrase�a correcta! acceso permitido.");  
		
		/*------- Bucle do while -------*/
		String genero = "";
		
		/* Sistema que solicita genero y altura para calcular peso ideal */
		
		do { //Iniciamos primer bloque del sistema donde solicita el genero.
			genero = JOptionPane.showInputDialog("Introduce tu g�nero (H/M)");
			//Comparamos validez del genero suministrado ignorando may�sculas y min�sculas.
		}while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
			//Cuando valide que el genero esta correcto, solicita la altura y la refundimos a entero.
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
			int pesoIdeal = 0;
			if(genero.equalsIgnoreCase("H")) {
				pesoIdeal=altura-110;
			}else if(genero.equalsIgnoreCase("M")) {
				pesoIdeal = altura-120;
			}
			System.out.println("Tu peso ideal es: " + pesoIdeal);
		
		/*------- Bucle do while y M�todo random() -------*/
		
		/* Utilizando el m�todo random para que nos de un n�mero aleatorio, 
           lo transformamos en entero. En while comparar� en n�mero introducido
           a traves del JOptionPane con el n�mero aleatorio y nos indicara si esta 
           correcto.
           El do while es para asegurarnos que el programa se ejecute al menos la 
           primera vez en el caso que el n�mero aleatorio sea cero, el el while normal 
           nunca se ejecutar�a.*/
		
		int aleatorio = (int)(Math.random()*100);
		System.out.println(aleatorio);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		do {
			intentos++;
			System.out.println("Introduce un n�mero por favor");
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio>numero){
				System.out.println("M�s alto");
			}
		}while(numero != aleatorio);
		System.out.println("Correcto. Lo haz conseguido en " + intentos + " intentos.");
		
		
		/*===========================*/
		/*=== Bucles determinados ===*/
		/*===========================*/
		
		//Se sabe cuantas veces se repetir� el bucle.

		/*------- Bucle for -------*/
		for(int i = 0 ; i > 10 ; i++) {
			/*Se inicia el bucle declarando e inicializando una variable; 
			 * se indica en que vuelta termina el bucle; se indica como ir� 
			 * aumentando la variable en cada vuelta. */
			
			System.out.println("Susana");
			
		}
		
		/*------- Bucle for -------*/
		for(int h = 10 ; h > 0 ; h--) {
			// Cambiando la forma que cambia la variable, pero no afecta al bucle.
			
			System.out.println("Susana");
			
		}
		/*------- Bucle for -------*/
		int arroba = 0;
		boolean punto = false;
		String mail = JOptionPane.showInputDialog("Introduce mail");
		for (int j = 0 ; j < mail.length() ; j++) {
			if (mail.charAt(j) == '@') {
				arroba++;
			}
			if (mail.charAt(j) == '.') {
				punto = true;
			}
		}
		if(arroba == 1 && punto == true) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto");
		}
		
		/*------- Bucle for -------*/
			long resultado = 1;
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Itroduce un n�mero"));
			
			for(int i = numero2 ; i > 0 ; i--)
	}

}
