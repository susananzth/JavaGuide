
public class EstructurasPrincipales {
	//Curso de pildorasinformáticas
	public static void main(String args[]) {
		System.out.println("Hola Mundo");
		/* Una impresión en consola de la oración "Hola mundo" */
		
		/*===========================*/
		/*===== TIPOS DE DATOS =====*/
		/*===========================*/
		
		/* Números enteros:
		 *    Int: 4 bytes de almacenamiento. Desde -2.147.483.648 hasta 2.147.483.647
		 * 	  Short: 2 byte de almacenamiento. Desde -32.768 hasta 32.767
		 *    Long: 8 bytes de almacenamiento. Desde Una barbaridad. Sufijo L.
		 *    Byte: 1 byte de almacenamiento. Desde -128 hasta 127
		 * 
		 * Coma flotante (Decimales):
		 *    Float: 4 bytes de almacenamiento. Aprox 6-7 cifras de decimales. Sufijo F. Ej: 3.25F
		 *    Double: 8 bytes de almacenamiento. Aprox 15 cifras decimales. No lleva sufijo.
		 *    
		 * Caracteres:
		 *    Char: para representar caracteres. 
		 *    
		 * Booleano:
		 *    Boolean: puede ser true o false.
		 * */
		
		/*===========================*/
		/*===== USO DE VARIABLE =====*/
		/*===========================*/
		
		/* Se declara la variables para indicar al ordenador que guarde un espacio 
		 * en la memoria RAM. Declaramos una variable de la siguiente forma: */
			int salario;
			byte edad;
			int uno, dos, tres;
			
		/* Al inicializar la variable, estamos indicando que en el espacio almacenado 
		 * en la RAM, irá el valor indicado. Inicializamos una variable de la siguiente forma: */
			salario = 5000;
			edad = 35;
			
			System.out.println(salario);
			System.out.println(edad);
		
		/*===========================*/
		/*===== USO DE CONSTANTE =====*/
		/*===========================*/
		
		/* Se declara utilizando la palabra final: */
			final double a_pulgada = 2.54;
			double cm = 6;
			double resultado = cm / a_pulgada;
			System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");
		
		/*===========================*/
		/*==== USO DE OPERADORES ====*/
		/*===========================*/
			
		/* Aritméticos:
		 * 	 + Suma.
		 *   - Resta.
		 *   * Multiplicación.
		 *   / División.
		 *   
		 * Lógicos, relacionales, booleanos:
		 *   > Mayor que.
		 *   < Menor que.
		 *   <> Mayor o menos que.
		 *   != Distinto que.
		 *   == Igual que.
		 *   && Y lógico
		 *   || O lógico
		 * 
		 * Incremento y decremento:
		 *   ++ Incremento.
		 *   -- Decremento.
		 *   +=n Incremento de n
		 *   -=n Decremento de n
		 * 
		 * Concatenación
		 *   + Une o concatena.
		 *   
		 * */
			
			int a = 5;
			int b;
			b = 7;
			int c = b + a;
			
			System.out.println(c);
			
			c++;
			System.out.println(c);
			c-=c;
			System.out.println(c);
			
			// Para divisiones, todos los valores implicados deben estar como double
			double d = 5;
			double e = 7;
			double f = e / d;
			System.out.println(f);
	}
	
}
