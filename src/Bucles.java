import javax.swing.*;
public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Bucles indeterminados ==*/
		/*===========================*/
		
		//No se sabe cuantas veces se repetir� el bucle.
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
		
				
		/*------- Bucle while -------*/
		
		
		
		/*===========================*/
		/*=== Bucles determinados ===*/
		/*===========================*/
		
		//Se sabe cuantas veces se repetir� el bucle.
	}

}
