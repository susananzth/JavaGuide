
public class ClasesPredefinidas {
	//Ejemplo de clases predefinidas: String, Math, Array, Thread.
	
	//Cada clase predefinida trae sus m�todos.
	
	//Podemos consultar todas esas clases y m�todos en la API de Java.
	
	/* El asistente de eclipse nos indica que tipo de datos colocar como 
	 * par�metro y que tipo de datos nos devolver�.*/
	
	public static void main(String[] args) {
		
		/*===========================*/
		/*======== CLASE MATH ========*/
		/*===========================*/
		
		/*------- M�todo sqrt() -------*/
		double raiz = Math.sqrt(9.0);
		System.out.println(raiz);
		
		float num1 = 5.85F;
		int resultado = Math.round(num1);
		System.out.println(resultado);
		
		/*------ M�todo pow() -------*/
		double base = 5;
		double exponente = 3;
		int resultado2 = (int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado2);
		
		/*===========================*/
		/*======= REFUNDICI�N =======*/
		/*===========================*/
		
		/* Cuando el resultaro del m�todo es de un tipo diferente al que 
		 * tenemos declarado en la variable, Cuidado con la refundici�n de un
		 * dato grande a un tipo de dato peque�o porque puede haber perdida de 
		 * informaci�n. En este caso, */
		
		double num2 = 5.85;
		int resultado3 = (int)Math.round(num2);
		System.out.println(resultado3);
		
		/*===========================*/
		/*======= CLASE STRING =======*/
		/*===========================*/
		
		// Sintaxis para almacenar un dato de tipo cadena
		String mi_nombre = "Susana";
		System.out.println("Mi nombre es: " + mi_nombre);
		// Donde mi_nombre es un objeto de la clase String.
		
		/*------- M�todo length() -------*/
		// Contar caracteres.
		String tu_nombre = "Pedro";
		System.out.println("Tu nombre '"+ tu_nombre +"', tiene " + tu_nombre.length() + " caracteres.");
		
		int contarNombre = tu_nombre.length();
		System.out.println("Tu nombre '"+ tu_nombre +"', tiene " + contarNombre + " caracteres.");
		
		/*------- M�todo charAt() -------*/
		// Contar caracteres.
		String ciudad = "Barquisimeto";
		System.out.println("La ciudad de '"+ ciudad +"' tiene como primera letra '" + ciudad.charAt(0) + "'.");
		int contarCiudad = ciudad.length();
		System.out.println("La ciudad de '"+ ciudad +"' tiene como primera letra '" + ciudad.charAt(contarCiudad-1) + "'.");
		
		
	}
	
}
