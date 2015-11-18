import java.util.Scanner;
public class Entrada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Empezamos con las preguntas");
		System.out.println("Dime un numero");
		double numerouno;
		numerouno = teclado.nextDouble();
		System.out.println("Dime otro numero");
		double numerodos;
		numerodos = teclado.nextDouble();
		System.out.println("La multiplicación de los dos numeros es" + " " + (numerouno * numerodos) + ".");
		
		System.out.println("Muy bien, sigamos con la segunda");
		
		System.out.println("Dime un numero que quieras dividir");
		double dividendo;
		dividendo = teclado.nextDouble();
		System.out.println("Entre cuanto lo quieres dividir");
		double divisor;
		divisor = teclado.nextDouble();
		
		System.out.println("El resto es " + (dividendo % divisor) + ".");
		
		
	}

}
