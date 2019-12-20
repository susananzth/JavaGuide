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
		/*
		while (clave.equals(pass) == false) { //Comparamos clave con pass utilizando 'equals'
			/* Si la consición es cierta, ejecutará el código dentro de estas llaves
			  hasta que se deje de cumplir la condición 
			
			
			//El while se repetira mientras la contraseña sea incorrecta.
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if (clave.contentEquals(pass) == false) {
				System.out.println("Contraseña incorrecta!");
			}
		}
		System.out.println("Contraseña correcta! acceso permitido.");
		*/
		
		/*------- Método random() -------*/
		
		/* Utilizando el método random para que nos de un número aleatorio, 
           lo transformamos en entero. En while comparará en número introducido
           a traves del JOptionPane con el número aleatorio y nos indicara si esta correcto.*/
		
		int aleatorio = (int)(Math.random()*100);
		System.out.println(aleatorio);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		while(numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un número por favor");
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio>numero){
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto. Lo haz conseguido en " + intentos + " intentos.");
		/*===========================*/
		/*=== Bucles determinados ===*/
		/*===========================*/
		
		//Se sabe cuantas veces se repetirá el bucle.
	}

}
