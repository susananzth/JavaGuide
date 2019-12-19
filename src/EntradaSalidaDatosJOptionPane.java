import javax.swing.JOptionPane;

public class EntradaSalidaDatosJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Utilizando JOptionPane ==*/
		/*===========================*/
		
		//JOptionPane saca un aventana gráfica para suministrar un dato. El dato lo guarda en String.
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor:") ;
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad por favor:") ;
		
		System.out.println("Hola " + nombreUsuario + ", tienes " + (edad) + " años.");
		
		
		//Ejemplo donde uno de los input necesitamos que sea 'int' para hacer una operación numérica.
		int edadUsuario = Integer.parseInt(edad); //Cambiamos a entero el string.
		System.out.println("Hola " + nombreUsuario + ", el año que viene tendrás " + (edadUsuario+1) + " años.");
		
		//Ejemplo donde uno de los input necesitamos que sea 'double' para hacer una operación numérica.
		String num1 = JOptionPane.showInputDialog("Intrduce un número");
		double num2 = Double.parseDouble(num1);
		System.out.print("La raíz de " + num2 + " es: "); // Print para imprimir un dato y que no tenga salto de línea.
		System.out.printf("%1.2f", Math.sqrt(num2)); // Printf para dar formato y poder continuar con el mensaje anterior. 
		

	}

}
