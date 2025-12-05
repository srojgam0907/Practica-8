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
		int opcion= elegirOpcion();
		
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
	

}









