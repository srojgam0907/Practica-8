package practica8;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		new calculadora().show();

	}
	
	public void show() {
		//TODO hacer funciones
		Scanner kb= new Scanner(System.in);
		float num1= pedirNumero(kb);
		float num2= pedirNumero(kb);
		float opcion= elegirOpcion(kb);
		
		operacion(num1, num2, opcion);
		
	}
<<<<<<< HEAD
	
	public float pedirNumero(Scanner kb) {
		float num=0;
		
		do {
			System.out.println("Introduce un numero mayor a cero");
			num= kb.nextInt();
			
			if(num<0) {
				System.out.println("ERROR");
			}
			
		}while(num<0);
		
		return num;
	}
	
	public int elegirOpcion(Scanner kb) {
		int opcion=0;
		
		do {
			System.out.println("Elije una opcion entre 1 y 4");
			opcion= kb.nextInt();
			
			if(opcion <1 || opcion >4) {
				System.out.println("ERROR");
			}
			
		}while(opcion <1 || opcion >4);
		
		return opcion;
	}
	
	public void operacion(float num1, float num2, int opcion) {
		
		switch(opcion) {
			case 1 -> sumar(num1, num2);
			case 2 -> restar(num1, num2);
			case 3 -> multiplicar(num1, num2);
			case 4 -> dividir(num1, num2);
			default -> System.out.println("ERROR");
		}
	}

	// Funcion Suma
	public int sumar(int num1, int num2){

		return num1 + num2;

	}

	// Funcion Resta
	public int restar(int num1, int num2){

		return num1 - num2;

	}

}









