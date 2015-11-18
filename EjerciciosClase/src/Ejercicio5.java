import java.util.Scanner;


public class Ejercicio5 {
	public static void main(String[] args) {
		
		System.out.println("Introduzca el numero de mes");

		Scanner teclado = new Scanner(System.in);

		int mes = teclado.nextInt();
		
		if( mes>=1 && mes<=12) {
			System.out.println("Mes correcto");
			
		} else{
		System.out.println("Mes no válido");
		}

	}


}