import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		String producto;
		double precio;
		int descuento;
		double preciofinal;
		System.out.println("¿Que producto quiere?");
		producto = teclado.nextLine();
		System.out.println("¿Que precio tiene?");
		precio = teclado.nextDouble();
		System.out.println("¿Cuando descuento tiene?");
		descuento = teclado.nextInt();
		preciofinal = precio - (((precio * descuento)/100));
		System.out.println("El producto seleccionado (" + producto + (")") + " vale " + precio + 
				"€ tiene un " + "descuento de " + descuento + "%. Su precio final es de " + preciofinal 
				+ "€.");
	}
}