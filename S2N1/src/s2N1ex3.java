
public class s2N1ex3 {
/*Exercici 3. Escriu el codi per a 
 * generar i capturar una excepció 
 * de tipus ArrayIndexOutOfBoundsException.  
 * */
	
	public static void main (String [] args) {
		
	
	    int [] nombres = {2, 4, 3};
	    
	    try {
	    	System.out.println(nombres[6]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Error" + e.getMessage());
	    }
	    
	}
}
