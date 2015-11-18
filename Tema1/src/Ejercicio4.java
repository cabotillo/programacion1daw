import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		String nombre;
		float nota;
		float notados;
		float notatres;
		System.out.println("¿Como te llamas?");
		nombre = teclado.nextLine();
		System.out.println("Dime tus 3 notas:");
		nota = teclado.nextFloat();
		notados = teclado.nextFloat();
		notatres = teclado.nextFloat();
		float media = (nota + notados + notatres)/3;

		
		System.out.println("Te llamas " + nombre + " y tu nota media es un: " + media + "." );

	}

}
