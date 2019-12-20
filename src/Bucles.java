import javax.swing.*;
public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Bucles indeterminados ==*/
		/*===========================*/
		
		//No se sabe cuantas veces se repetirá el bucle.
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
		
				
		/*------- Bucle while -------*/
		
		
		
		/*===========================*/
		/*=== Bucles determinados ===*/
		/*===========================*/
		
		//Se sabe cuantas veces se repetirá el bucle.
	}

}
