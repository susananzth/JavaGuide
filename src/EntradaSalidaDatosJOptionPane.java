import javax.swing.JOptionPane;

public class EntradaSalidaDatosJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Utilizando JOptionPane ==*/
		/*===========================*/
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor:") ;
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad por favor:") ;
		
		System.out.println("Hola " + nombreUsuario + ", tienes " + (edad) + " a�os.");
		
		
		//Ejemplo donde uno de los input necesitamos que sea 'int' para hacer una operaci�n num�rica.
		int edadUsuario = Integer.parseInt(edad); //Cambiamos a entero el string.
		System.out.println("Hola " + nombreUsuario + ", el a�o que viene tendr�s " + (edadUsuario+1) + " a�os.");
		
		//Ejemplo donde uno de los input necesitamos que sea 'double' para hacer una operaci�n num�rica.
		String num1 = JOptionPane.showInputDialog("Intrduce un n�mero");
		double num2 = Double.parseDouble(num1);

	}

}
