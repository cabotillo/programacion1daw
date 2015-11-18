
public class Ejercicio3 {

	public static void main(String[] args) {
		//Potencias de 3 menores de 12000
		int i=0;
		int numero=3;
		double potencia=1;
	
		System.out.println("Potencias de 3 menores de 12000");
		
		do{
			System.out.println("Con el exponente " + i + " el resultado"
					+ " de la potencia de " + numero + " es " + potencia);
			i++;
			potencia=Math.pow(numero,i);	
		}while(potencia<=12000);
	}

}
