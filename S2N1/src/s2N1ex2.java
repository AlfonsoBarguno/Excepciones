
public class s2N1ex2 {

	public static void main(String[] args) {
		/*Exercici 2. Defineix una 
		 * refer�ncia a un objecte i inicialitza-la 
		 * amb null. Tracta d'invocar un m�tode 
		 * a trav�s d'aquesta refer�ncia. 
		 * Ara envolta el codi amb una cl�usula try-catch per a 
		 * capturar l'excepci�. Mostra el 
		 * missatge i el tipus d'excepci�.
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


