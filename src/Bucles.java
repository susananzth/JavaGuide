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
		/*
		while (clave.equals(pass) == false) { //Comparamos clave con pass utilizando 'equals'
			/* Si la consici�n es cierta, ejecutar� el c�digo dentro de estas llaves
			  hasta que se deje de cumplir la condici�n 
			
			
			//El while se repetira mientras la contrase�a sea incorrecta.
			pass = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			if (clave.contentEquals(pass) == false) {
				System.out.println("Contrase�a incorrecta!");
			}
		}
		System.out.println("Contrase�a correcta! acceso permitido.");
		*/
		
		/*------- M�todo random() -------*/
		
		/* Utilizando el m�todo random para que nos de un n�mero aleatorio, 
           lo transformamos en entero. En while comparar� en n�mero introducido
           a traves del JOptionPane con el n�mero aleatorio y nos indicara si esta correcto.*/
		
		int aleatorio = (int)(Math.random()*100);
		System.out.println(aleatorio);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		while(numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un n�mero por favor");
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio>numero){
				System.out.println("M�s alto");
			}
		}
		System.out.println("Correcto. Lo haz conseguido en " + intentos + " intentos.");
		/*===========================*/
		/*=== Bucles determinados ===*/
		/*===========================*/
		
		//Se sabe cuantas veces se repetir� el bucle.
	}

}
