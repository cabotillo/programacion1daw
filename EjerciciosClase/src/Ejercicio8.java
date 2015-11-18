import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		
		String palabra = "computer";

		System.out.println("¿Como se dice ordenador en ingles?");

		Scanner teclado = new Scanner(System.in);

		palabra = teclado.nextLine();

		if (palabra == "computer") {
			System.out.println("Correctoooooooo");

		} else {
			System.out.println("Has fallado, ves a buscar un traductor y vuelve a proabar");
		}

	}

}