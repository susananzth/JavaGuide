import javax.swing.JOptionPane;

public class EntradaSalidaDatosJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*===========================*/
		/*== Utilizando JOptionPane ==*/
		/*===========================*/
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor:") ;
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad por favor:") ;
		
		System.out.println("Hola " + nombreUsuario + ", tienes " + (edad) + " años.");
		
		int edadUsuario = Integer.parseInt(edad); //Cambiamos a entero el string.
		System.out.println("Hola " + nombreUsuario + ", el año que viene tendrás " + (edadUsuario+1) + " años.");

	}

}
