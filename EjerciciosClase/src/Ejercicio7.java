import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		int numero = 7;

		System.out.println("Di un numero");

		Scanner teclado = new Scanner(System.in);

		numero = teclado.nextInt();

		if (numero == 7) {
			System.out.println("Eres el ganado, enhorabuena!!!");

		} else {
			System.out.println("Has fallado, vuelve a intentarlo mas tarde.");
		}

	}

}