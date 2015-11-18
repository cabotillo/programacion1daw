import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String producto;
		int unidadesvendidas;
		double total;
		double precio = 5;
		System.out.println("Introduzca el nombre del producto");
		producto = teclado.nextLine();
		System.out.println("¿Cuantas unidades ha comprado?");
		unidadesvendidas = teclado.nextInt();
		total = unidadesvendidas * precio;
		System.out.println("Ha comprado "+ unidadesvendidas + " unidades de " + producto
		+ " eso hace un total de " + precio + "€.");
		

	}

}