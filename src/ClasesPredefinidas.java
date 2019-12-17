
public class ClasesPredefinidas {
	//Curso de pildorasinformáticas
	
	//Ejemplo de clases predefinidas: String, Math, Array, Thread.
	
	//Cada clase predefinida trae sus métodos.
	
	//Podemos consultar todas esas clases y métodos en la API de Java.
	
	/* El asistente de eclipse nos indica que tipo de datos colocar como 
	 * parámetro y que tipo de datos nos devolverá.*/
	
	public static void main(String[] args) {
		
		/*===========================*/
		/*======== CLASE MATH ========*/
		/*===========================*/
		
		/*------- Método sqrt() -------*/
		double raiz = Math.sqrt(9.0);
		System.out.println(raiz);
		
		float num1 = 5.85F;
		int resultado = Math.round(num1);
		System.out.println(resultado);
		
		/*------ Método pow() -------*/
		double base = 5;
		double exponente = 3;
		int resultado2 = (int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado2);
		
		/*===========================*/
		/*======= REFUNDICIÓN =======*/
		/*===========================*/
		
		/* Cuando el resultaro del método es de un tipo diferente al que 
		 * tenemos declarado en la variable, Cuidado con la refundición de un
		 * dato grande a un tipo de dato pequeño porque puede haber perdida de 
		 * información. En este caso, */
		
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
		
		/*------- Método length() -------*/
		// Contar caracteres.
		String tu_nombre = "Pedro";
		System.out.println("Tu nombre '"+ tu_nombre +"', tiene " + tu_nombre.length() + " caracteres.");
		
		int contarNombre = tu_nombre.length();
		System.out.println("Tu nombre '"+ tu_nombre +"', tiene " + contarNombre + " caracteres.");
		
		/*------- Método charAt() -------*/
		// Extraer caracteres.
		String ciudad = "Barquisimeto";
		System.out.println("La ciudad de '"+ ciudad +"' tiene como primera letra '" + ciudad.charAt(0) + "'.");
		int contarCiudad = ciudad.length();
		System.out.println("La ciudad de '"+ ciudad +"' tiene como primera letra '" + ciudad.charAt(contarCiudad-1) + "'.");
		
		/*------- Método charAt() -------*/
		// Sustraer caracteres.
		String frase = "Hoy es un estupendo día para aprender a programar";
		String fraseResumen = frase.substring(1, 3);
		System.out.println(fraseResumen);
		
		String fraseResumen2 = frase.substring(0, 28) + " irnos a la playa.";
		System.out.println(fraseResumen2);
		
		/*------- Método equals() -------*/
		// Compara caracteres.
		String alumno1, alumno2, alumno3;
		alumno1 = "David";
		alumno2 = "David";
		alumno3 = "david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equals(alumno3)); //Distingue entre mayúscula
		System.out.println(alumno1.equalsIgnoreCase(alumno3)); //No distingue entre mayúscula
	}
	
}
