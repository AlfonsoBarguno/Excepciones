
public class s2N1ex2 {

	public static void main(String[] args) {
		/*Exercici 2. Defineix una 
		 * referència a un objecte i inicialitza-la 
		 * amb null. Tracta d'invocar un mètode 
		 * a través d'aquesta referència. 
		 * Ara envolta el codi amb una clàusula try-catch per a 
		 * capturar l'excepció. Mostra el 
		 * missatge i el tipus d'excepció.
		 * */
			
			Object error = null; 
			
			
			
			try {
				error.toString();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage() + e.getClass() ); 
			} finally {
				System.out.println("Es decir, como la cadena no tiene eslabones, da error.");
			}
	}
	}


