import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precios[] = new double[10];

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Introduce el precio " + i + " :");
			precios[i] = entrada.nextDouble();
		}
		for (int i = 0; i < precios.length;i++){
			System.out.println("El precio del producto " + i + " " + precios[i]);
		}
			
	}

}
