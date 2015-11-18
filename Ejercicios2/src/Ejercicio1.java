
public class Ejercicio1 {

	public static void main(String[] args) {
		//Multiplos de 5 entre 1 y 1000
		int i = 5;
		int j = 1;
		System.out.println("Multiplos de 5 entre 1 y 1000\n");
		while (i<= 1000) {
			System.out.print(j + ": " + i + "||\n");
			i = i + 5;
			j++;
		}

	}

}
