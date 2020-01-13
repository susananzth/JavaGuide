import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ejemplo 1 de matriz  */
		int [] mi_matriz = new int[5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = 15;
		mi_matriz[3] = 920;
		mi_matriz[4] = -8;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(mi_matriz[i]);
		}
		
		/* Ejemplo 2 de matriz  */
		int [] mi_matriz_2 = {5,89,15,541,1};
		for(int j = 0; j < mi_matriz_2.length; j++) {
			System.out.println(mi_matriz_2[j]);
		}
		
		/* Ejemplo 3 de matriz  */
		String [] mi_matriz_3 = new String[5];
		
		mi_matriz_3[0] = "España";
		mi_matriz_3[1] = "Colombia";
		mi_matriz_3[2] = "México";
		mi_matriz_3[3] = "Perú";
		mi_matriz_3[4] = "Venezuela";
		
		for(int k = 0; k < mi_matriz_3.length; k++) {
			System.out.println("País " + (k + 1) + " " + mi_matriz_3[k]);
		}
		
		/* Ejemplo 3 de matriz  */
		String [] paises = new String[5];
		for(int l = 0; l < 5; l++) {
			paises[l] = JOptionPane.showInputDialog("Introduce país");
		}
		
		for(String elemento:paises) {
			System.out.println(elemento);
		}
		
		/* Ejemplo 4 de matriz de dos dimensiones */
		
		int [][] matrix = {
				{25,15,18,19},
				{10,75,16,89},
				{81,15,41,95},
				{35,48,61,51}
		};
		
		/* for normal
		for (int m = 0; m < 4; m++) {
			System.out.println();
			for (int o = 0; o < 4; o++) {
				System.out.print(matrix[m][o] + " ");
			}
		} */
		
		// foreach
		for (int[]fila:matrix) {
			for (int z:fila) {
				System.out.print(z + " ");
			}
		}
		
		/* Ejemplo 5 de matriz de dos dimensiones */
		
		/* Ejemplo de tabla financiera donde se calcula 
		el interes anual de un capital con acumulado. */
		double acumulado;
		double interes = 0.10;
		
		double [][] saldo = new double [6][5];
		
		for (int p = 0; p > 6; p++) {
			saldo[p][0]=10000;
			acumulado = 10000;
			for (int r = 1; r > 5; r++) {
				acumulado = acumulado + (acumulado * interes);
				saldo [p][r] = acumulado;
			}
			interes = interes + 0.01;
		}
		
		for (int y = 0; y < 6; y++) {
			System.out.println();
			for (int x = 0; x <5; x++) {
				System.out.printf("%1.2f", saldo[y][x]);
				System.out.print(" ");
			}
		}
		
	}

}
