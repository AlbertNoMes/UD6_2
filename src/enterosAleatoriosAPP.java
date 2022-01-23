import javax.swing.JOptionPane;

public class enterosAleatoriosAPP {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog("Introduce la cantidad"); // PEDIMOS LA CANTIDAD
		int cantidad = Integer.parseInt(texto); // LA PASAMOS A INT

		texto = JOptionPane.showInputDialog("Introduce un numero"); // PEDIMOS EL PRIMER NUMERO
		int numero1 = Integer.parseInt(texto); // LO PASAMOS A INT

		texto = JOptionPane.showInputDialog("Introduce un numero"); // PEDIMOS EL SEGUNDO NUMERO
		int numero2 = Integer.parseInt(texto); // LO PASAMOS A INT

		// HACEMOS EL BUCLE CON EL MÉTODO DEL RANDOM
		// FOR(INICIALIZACION; CONDICION; INCREMENTO)
		for (int i = 0; i < cantidad; i++) {
			System.out.println(generaNumero(numero1, numero2));
		}
	}

	// MÉTODO CON EL RANDOM ENTRE LOS 2 NUMEROS
	public static int generaNumero(int num1, int num2) {
		return ((int) Math.floor(Math.random() * (num2 - num1) + num1));
	}
}
