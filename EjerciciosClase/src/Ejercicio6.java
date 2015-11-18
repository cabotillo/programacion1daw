import java.util.Scanner;


public class Ejercicio6 {
	public static void main(String[] args) {
		
		
		double precio;
		int unidadescompradas;

		System.out.println("¿Cuanto cuesta?");

		Scanner teclado = new Scanner(System.in);

		precio = teclado.nextInt();
		
		System.out.println("¿Cuantas unidades se lleva?");
		
		unidadescompradas = teclado.nextInt();
		double grandescuento = precio - ((precio*15)/100);
		double pequeniodescuento = precio - ((precio*5)/100);
		if( precio>75) {
			System.out.println("El precio final seran " + grandescuento + " €.");
			
		} else{
		System.out.println("El precio final seran " + pequeniodescuento + " €.");
		}

	}


}