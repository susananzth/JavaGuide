import javax.swing.*;
import java.util.*;
public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Bucles indeterminados ==*/
		/*===========================*/
		
		//No se sabe cuantas veces se repetirá el bucle.
		
		/*------- Bucle while -------*/
		String clave = "Susana";
		
		String pass = "";
		
		while (clave.equals(pass) == false) { //Comparamos clave con pass utilizando 'equals'
			/* Si la consición es cierta, ejecutará el código dentro de estas llaves
			  hasta que se deje de cumplir la condición */
			
			
			//El while se repetira mientras la contraseña sea incorrecta.
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if (clave.contentEquals(pass) == false) {
				System.out.println("Contraseña incorrecta!");
			}
		}
		System.out.println("Contraseña correcta! acceso permitido.");  
		
		/*------- Bucle do while -------*/
		String genero = "";
		
		/* Sistema que solicita genero y altura para calcular peso ideal */
		
		do { //Iniciamos primer bloque del sistema donde solicita el genero.
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
			//Comparamos validez del genero suministrado ignorando mayúsculas y minúsculas.
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
		
		/*------- Bucle do while y Método random() -------*/
		
		/* Utilizando el método random para que nos de un número aleatorio, 
           lo transformamos en entero. En while comparará en número introducido
           a traves del JOptionPane con el número aleatorio y nos indicara si esta 
           correcto.
           El do while es para asegurarnos que el programa se ejecute al menos la 
           primera vez en el caso que el número aleatorio sea cero, el el while normal 
           nunca se ejecutaría.*/
		
		int aleatorio = (int)(Math.random()*100);
		System.out.println(aleatorio);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		do {
			intentos++;
			System.out.println("Introduce un número por favor");
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio>numero){
				System.out.println("Más alto");
			}
		}while(numero != aleatorio);
		System.out.println("Correcto. Lo haz conseguido en " + intentos + " intentos.");
		
		
		/*===========================*/
		/*=== Bucles determinados ===*/
		/*===========================*/
		
		//Se sabe cuantas veces se repetirá el bucle.

		/*------- Bucle for -------*/
		for(int i = 0 ; i > 10 ; i++) {
			/*Se inicia el bucle declarando e inicializando una variable; 
			 * se indica en que vuelta termina el bucle; se indica como irá 
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
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Itroduce un número"));
			
			for(int i = numero2 ; i > 0 ; i--)
	}

}
