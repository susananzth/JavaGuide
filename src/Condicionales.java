import java.util.*;
import javax.swing.*;
public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*====== Condicional IF ======*/
		/*===========================*/

		Scanner entrada = new Scanner(System.in); //Construimos el objeto tipo scanner in para introducir información
		System.out.println("Introduce tu edad, por favor: ");
		int edad = entrada.nextInt(); //En la variable guardamos lo que se introdusca por consola y será tipo entero.
		
		//Evaluamos cual es la edad que se introduce.
		if(edad <= 18) {//Si
			System.out.println("Eres joven.");
		}else if(edad <= 45){ //Sino
			System.out.println("Eres maduro.");
		}else { //Sino
			System.out.println("Eres anciano.");
		}
		
		/*===========================*/
		/*==== Condicional Switch ====*/
		/*===========================*/
		
		Scanner entrada2 = new Scanner(System.in); //Construimos el objeto tipo scanner in para introducir información
		// \n para salto de linea.
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		int figura = entrada2.nextInt();
		
		switch (figura) { //Revisa lo que introdujo en la variable "figura"
		case 1: //Se cumple el caso si el dato suministrado es 1.
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			break;
			
		case 2: //Se cumple el caso si el dato suministrado es 2.
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			System.out.println("El área del rectángulo es: " + base*altura);
			break;
			
		case 3: //Se cumple el caso si el dato suministrado es 3.
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			System.out.println("El área del triángulo es: " + base*altura/2);
			break;
			
		case 4: //Se cumple el caso si el dato suministrado es 4.
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El área del círculo es: "); //Imprimo sin salto de linea.
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); //Imprimo con formato para que solo muestre 2 decimales.
			break;
		default:
			System.out.println("La opción no es correcta.");
		}
	}

}
