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
	}

}
