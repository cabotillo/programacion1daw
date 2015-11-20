import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;
		while (i < 10) {
			System.out.print("Introduce la nota " + i + " :");
			notas[i] = entrada.nextDouble();
			i++;
		}
		i = 0;
		while (i < 10) {
			System.out.println("La nota " + i + " es " + notas[i]);
			i++;
		}

	}

}
