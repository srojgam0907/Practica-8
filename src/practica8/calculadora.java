package practica8;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		new calculadora().show();

	}
	
	public void show() {
		//TODO hacer funciones
		Scanner kb= new Scanner(System.in);
		int num1= pedirNumero(kb);
		int num2= pedirNumero(kb);
		int opcion= elegirOpcion(kb);
		
		operacion(num1, num2, opcion);
		
	}
	
	public int pedirNumero(Scanner kb) {
		int num=0;
		
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
	
	public void operacion(int num1, int num2, int opcion) {
		
		switch(opcion) {
		case 1 -> 
		}
		
		
	}
	

}









