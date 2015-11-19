public class Ejercicio3 {

	public static void main(String[] args) {
		double densidad[] = {5.43, 5.24, 5.515, 3.940, 1.33, 0.697, 1.29, 1.76, 2};
		String planetas[] = { "Mercurio", "Venus", "Tierra", "Marte",
				"Jupiter", "Saturno", "Urano", "Neptuno", "Pluton" };
		
		for (int i = 0; i <= 8; i++) {
			System.out.println(planetas[i] + " tiene " + densidad[i] + " g/cm3");
			
		}

	}

}