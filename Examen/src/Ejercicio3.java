import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Pide la presion en milibares
		// Muestra mensajes dependiendo de la presion
		// Bucle si esta entre 800 y 1200
		int presion;

		do {
			System.out.println("Introduce la presion en milibares");
			presion = entrada.nextInt();
			if (presion <= 1008) {
				System.out.println("Presion baja. Se acerca una borrasca");
			} else if (presion >= 1008 && presion <= 1018) {
				System.out.println("Presion normal. Buen tiempo");
			} else {
				System.out.println("Presion alta. Mejoría del tiempo");
			}
		} while (presion >= 800 && presion <= 1200);

	}

}
