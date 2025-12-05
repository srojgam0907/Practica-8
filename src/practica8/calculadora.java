package practica8;

public class calculadora {

	public static void main(String[] args) {
		new calculadora().show();

	}
	
	public void show() {
		//TODO hacer funciones
		int num1= pedirNumero();
		int num2= pedirNumero();
		int opcion= elegirOpcion();
		
	}

	public int sumar(int num1, int num2){

		return num1 + num2;

	}

	public int restar(int num1, int num2){

		return num1 - num2;
		
	}

}
