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
		
		
	}

}
