import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String invitados[] = new String[5];
		
		for (int i = 0;i < invitados.length;i++){
			System.out.print("Introduce tu nombre, invitado " + i + ": ");
			invitados[i] = entrada.next();
		}
		System.out.println("\nLa lista de invitados es:");
		System.out.println("== ===== == ========= == \n");
		for(int i = 0; i<invitados.length;i++){
			System.out.print("Los invitados son " + invitados[i] + "\t");
		}
	}

}
