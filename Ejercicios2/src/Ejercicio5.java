import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//El usuario intenta adivinar un numero creado por el programa.
		//Tienen 3 oportunidades. Al finalizadar las oportunidades le dira que ha fallado
		//Si acierta el numero saldra el mensaje, Has acertado.
		final int numero=(int) (Math.random()*10+1);
		int i =1;
		int respuesta;
		do{
			System.out.println("Adivina el numero");
			respuesta = entrada.nextInt();
			i++;
			
		}while(respuesta != numero && i<=3);
		
		String validacion = (respuesta == numero)?"!Has acertado!":"Has fallado :-(";
		System.out.println(validacion);


	}

}
