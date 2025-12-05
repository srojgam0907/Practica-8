package practica8;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		new calculadora().show();

	}

	public void show() {
		Scanner kb= new Scanner(System.in);
		float num1= pedirNumero(kb);
		float num2= pedirNumero(kb);
		int opcion= elegirOpcion(kb);
		
		System.out.println(operacion(num1, num2, opcion)); 

	}
	
	public float pedirNumero(Scanner kb) {
		float num=0;
		
		do {
			System.out.println("Introduce un numero mayor a cero");
			num= kb.nextInt();
			
			if(num<=0) {
				System.out.println("ERROR");
			}
			
		}while(num<=0);
		
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
	
	public float operacion(float num1, float num2, int opcion) {
		float resultado= 0; 
		
		switch(opcion) {
			case 1 -> resultado= sumar(num1, num2);
			case 2 -> resultado= restar(num1, num2);
			case 3 -> resultado= multiplicar(num1, num2);
			case 4 -> resultado= dividir(num1, num2);
			default -> System.out.println("ERROR");
		}
		
		return resultado;
	}

	// Funcion Suma (Alvaro)
	public float sumar(float num1, float num2){

		return num1 + num2;

	}

	// Funcion Resta (Alvaro)
	public float restar(float num1, float num2){

		return num1 - num2;

	}

	//Funcion dividir (Oleh)
	public float dividir(float n1, float n2) {
		if (n2 == 0) {
			return 0;
		}
		return n1 / n2;

	}

	//Funcion multiplicar (Oleh)
	public float multiplicar(float n1, float n2) {
		return n1 * n2;
	}
}









