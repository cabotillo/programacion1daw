
public class Ejercicio2 {

	public static void main(String[] args) {
		//Suma de todos los multiplos de 5 entre 1 y 1000.
		int i = 5;
		int j = 1;
		int suma=0;
		while (i<= 1000) {
			suma=suma+i;
			i = i + 5;
			j++;
		}
		System.out.println("La suma de todos los multiplos de 5 entre 1 y 1000 es " + suma);
	}

}
