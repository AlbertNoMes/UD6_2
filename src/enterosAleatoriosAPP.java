import javax.swing.JOptionPane;
public class enterosAleatoriosAPP {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog("Introduce la cantidad"); //Pedimos la cantidad
		int cantidad=Integer.parseInt(texto);
		texto=JOptionPane.showInputDialog("Introduce un numero"); //Pedimos el primer numero
		int numero1=Integer.parseInt(texto);
		texto=JOptionPane.showInputDialog("Introduce un numero"); //Pedimos el segundo numero
		int numero2=Integer.parseInt(texto);
		//Hacemos el bucle
		for(int i=0;i<cantidad;i++) {
			System.out.println(generaNumero(numero1, numero2));
		}
	}
	//Hacemos el metodo de los numeros aleatorios
	public static int generaNumero(int num1, int num2) {
		return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	}
}
