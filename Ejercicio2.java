import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Pide un umero mayor que 10
		// Y muestra ese numero hasta llegar al 11

		int numero = 0;
		System.out.println("Introduce un numero entero mayor de 10");
		numero = entrada.nextInt();

		for (int i = 1; numero > 10; i++) {
			System.out.println(numero);
			numero = numero - 1;

		}

	}

}
