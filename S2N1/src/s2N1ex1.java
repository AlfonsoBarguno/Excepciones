
public class s2N1ex1 {
	public static void main (String [] args) {
		
		/*Exercici 1. Crea una classe amb un main() 
		 * que generi un objecte de la classe Exception 
		 * dins d'un bloc try-catch. Proporciona al constructor 
		 * de l'excepci� un missatge especific. Captura l'excepci� 
		 * dins d'una cl�usula catch i imprimeix el seu missatge. 
		 * Afegeix una cl�usula finally 
		 * i imprimeix un missatge per a demostrar que va 
		 * passar per all�.
		 * */
		
		try {
	        throw new Exception("Aixo es una excepcio");
	        //main2();
	    } catch (Exception e) {
	        System.out.println("S'ha produit una excepcio: " + e.getMessage());
	    } finally {
	        System.out.println("sempre paso per aqui hi haguin errors o no");
	    }
		}
}
