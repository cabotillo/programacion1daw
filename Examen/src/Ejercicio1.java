public class Ejercicio1 {

	public static void main(String[] args) {
		// Numeros impares de 3 al 300
		// Divisible entre 9 mensaje

		int numero = 3;

		while (numero <= 300) {
			System.out.print(" " + numero + " \t");
			numero = numero + 3;
			if (numero % 9 == 0) {
				System.out.println(numero + " Divisible por 9");
			}
		}
	}

}
