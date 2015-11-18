import java.util.Scanner;


public class Ejercicio4 {
	public static void main(String[] args) {
		
		System.out.println("Introduzca una contraseña");

		Scanner teclado = new Scanner(System.in);

		int contra = teclado.nextInt();
		
		if( contra == 1234) {
			System.out.println("Acceso concedido.");
			
		}
	}

}