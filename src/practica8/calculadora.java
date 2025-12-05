package practica8;

public class calculadora {

	public static void main(String[] args) {
		new calculadora().show();

	}

	public void show() {
		// TODO hacer funciones
		int num1 = pedirNumero();
		int num2 = pedirNumero();
		int opcion = elegirOpcion();

	}

	public int dividir(int n1, int n2) {
		if (n2 == 0) {
			return 0;
		}
		return n1 / n2;

	}

	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}
}
