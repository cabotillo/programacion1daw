import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int divisor;
		int dividendo;
		System.out.println("Que numero quieres dividor");
		dividendo = teclado.nextInt();
		System.out.println("¿Entre cuanto quieres dividir?");
		divisor = teclado.nextInt();
		int cociente = dividendo / divisor;
		int resto = dividendo % divisor;
		System.out.println("El cociente es " + cociente + " y el resto " + resto);

	}

}